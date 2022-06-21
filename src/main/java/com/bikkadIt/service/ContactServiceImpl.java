package com.bikkadIt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.model.Contact;
import com.bikkadIt.repository.CurdRepository;

@Service
public class ContactServiceImpl implements ContactServiceI{
	
	@Autowired
	private CurdRepository curdrepository;
	
	@Override
	public boolean saveContact(Contact contact) {
		Contact save = curdrepository.save(contact);
		if(save!=null) {
			return true;
		}else

		return false;
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> contact = curdrepository.findAll();
		if(contact!=null) {
			return contact;
		}else

		return null;
	}

}
