package com.crm.Service;

import java.util.List;

import com.crm.Entity.Lead;

public interface LeadService {

	void createLead(Lead lead);

	Lead getLead(long id);

	void deleteLead(long id);

	List<Lead> getLeads();

}
