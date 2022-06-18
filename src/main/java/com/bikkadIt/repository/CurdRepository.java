package com.bikkadIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIt.model.Contact;

public interface CurdRepository extends JpaRepository<Contact, Integer>{

}
