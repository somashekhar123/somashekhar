package com.crm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.Entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long>{

}
