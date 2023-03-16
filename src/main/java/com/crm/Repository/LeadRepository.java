package com.crm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.Entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long>{

}
