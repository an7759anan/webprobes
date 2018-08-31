package com.myfamily.myapp.service;

import java.util.List;
import com.myfamily.myapp.domain.Contact;

public interface ContactService {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}