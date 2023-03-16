package com.crm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.Entity.Contact;


public interface ContactRepository extends JpaRepository<Contact, Long>{

}
