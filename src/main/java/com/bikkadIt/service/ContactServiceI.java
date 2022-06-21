package com.bikkadIt.service;

import java.util.List;

import com.bikkadIt.model.Contact;

public interface ContactServiceI {
	
	boolean saveContact(Contact contact);
	List<Contact>getAllContact();

}
