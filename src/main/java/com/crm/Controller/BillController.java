package com.crm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.Entity.Billing;
import com.crm.Entity.Contact;
import com.crm.Service.BillService;
import com.crm.Service.ContactService;

@Controller
public class BillController {
	@Autowired
	private ContactService contactServo;
	@Autowired
	private BillService billServo;
	@RequestMapping("/genarateBill")
	public String getContact(@RequestParam("id")long id,ModelMap m)
	{
		Contact contacts=contactServo.getContactData(id);
		m.addAttribute("contacts",contacts);
		return"genarate Bill";
		
	}
	@RequestMapping("/save")
	public String saveBill(@ModelAttribute("bill") Billing bill,ModelMap m)
	{
		billServo.saveBills(bill);
		m.addAttribute("m",bill);
		return"Bill_page";
	}

}
