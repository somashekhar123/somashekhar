package com.crm.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.Entity.Contact;
import com.crm.Repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {
@Autowired
private ContactRepository contactRepo;
	@Override
	public void saveContact(Contact c) {
		contactRepo.save(c);
		
	}
	@Override
	public List<Contact> getContact() {
		List<Contact> findAll = contactRepo.findAll();
		return findAll;
	}
	@Override
	public Contact getContactData(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}
	

}
