package com.crm.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.Entity.Lead;
import com.crm.Repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService{
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void createLead(Lead lead) {
		leadRepo.save(lead);
		
	}

	@Override
	public Lead getLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteLead(long id) {
		leadRepo.deleteById(id);
		
		
	}

	@Override
	public List<Lead> getLeads() {
		List<Lead> findAll = leadRepo.findAll();
		return findAll;
	}

	

	

	

}
