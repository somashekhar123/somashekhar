package com.crm.Service;

import java.util.List;

import com.crm.Entity.Contact;

public interface ContactService {

	void saveContact(Contact c);

	List<Contact> getContact();

	Contact getContactData(long id);

	

}

