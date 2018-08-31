package com.myfamily.myapp.dao;

import java.util.List;
import com.myfamily.myapp.domain.Contact;

public interface ContactDAO {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}