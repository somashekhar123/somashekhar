package com.crm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.Entity.Contact;
import com.crm.Entity.Lead;
import com.crm.Service.ContactService;
import com.crm.Service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadservo;
	
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("/page")
	public String createLeadPage()
	{
		return"create_page";
		
	}
	@RequestMapping("/saveLead")
	public String createLeads(@ModelAttribute("lead")Lead lead,ModelMap m)
	{
		leadservo.createLead(lead);
		m.addAttribute("m",lead);
		
	return"lead_info";
	}
	@RequestMapping("/convet")
	public String saveContacts(@RequestParam("id")long id)
	{
		Lead lead=leadservo.getLead(id);
		
		Contact c=new Contact();
		c.setFirstName(lead.getFirstName());
		c.setLastName(lead.getLastName());
		c.setEmail(lead.getEmail());
		c.setMobile(lead.getMobile());
		c.setSource(lead.getSource());
		
		leadservo.deleteLead(lead.getId());
		contactservice.saveContact(c);
		
		
		return "create_page";
		
	}
     @RequestMapping("/listLead")
	public String getLeadData(ModelMap model)
	{
	List<Lead> leads=leadservo.getLeads();
	model.addAttribute("leads",leads );
		return"list_lead";
	}
     @RequestMapping("/findById")
     public String getById(@RequestParam("id")long id,ModelMap m)
     {
    	 Lead lead=leadservo.getLead(id);
    	 m.addAttribute("m",lead);
    	 return "lead_info";
     }
	
	
	
}
