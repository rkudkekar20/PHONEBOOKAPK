package com.bikkadIt.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.model.Contact;

@Repository
public interface CurdRepository extends JpaRepository<Contact, Serializable>{
	

}
