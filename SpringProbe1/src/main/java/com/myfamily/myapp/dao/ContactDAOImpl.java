package com.myfamily.myapp.dao;
import java.util.List;

import com.myfamily.myapp.domain.Contact;
import com.myfamily.myapp.web.ContactController;

//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.myfamily.myapp.domain.Contact;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public class ContactDAOImpl implements ContactDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(ContactDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addContact(Contact contact) {
		logger.info("Firstname: {}",contact.getFirstname());
		sessionFactory.getCurrentSession().save(contact);
//		Session s = sessionFactory.getCurrentSession(); 
//		s.
	}

	@SuppressWarnings("unchecked")
	public List<Contact> listContact() {

		return sessionFactory.getCurrentSession().createQuery("from Contact")
			.list();
	}

	public void removeContact(Integer id) {
		Contact contact = (Contact) sessionFactory.getCurrentSession().load(
				Contact.class, id);
		if (null != contact) {
			sessionFactory.getCurrentSession().delete(contact);
		}

	}
}