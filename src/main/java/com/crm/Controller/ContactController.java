package com.crm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.Entity.Contact;
import com.crm.Service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactservice;

    @RequestMapping("/listcontacts")
	public String getContact(ModelMap m)
	{
		
		List<Contact> contact=contactservice.getContact();
		m.addAttribute("contact",contact);
		
		return"list_contact";
	}    

}
