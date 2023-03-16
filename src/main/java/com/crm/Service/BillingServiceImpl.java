package com.crm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.Entity.Billing;
import com.crm.Repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillService {
	@Autowired
	private BillingRepository billingRepository;

	@Override
	public void saveBills(Billing bill) {
		billingRepository.save(bill);
		
	}

	
		

}
