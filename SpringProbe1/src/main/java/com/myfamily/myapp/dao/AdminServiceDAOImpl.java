package com.myfamily.myapp.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.myfamily.myapp.domain.User;

@Repository
public class AdminServiceDAOImpl implements AdminServiceDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> listUser() {
		return sessionFactory.getCurrentSession().createQuery("from User")
				.list();
	}

	@Override
	public void addUser(User user) {
		// TODO password encoding
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void removeUser(String username) {
		User user = (User) sessionFactory.getCurrentSession().load(
				User.class, username);
		if (null != user) {
			sessionFactory.getCurrentSession().delete(user);	
		}
	}

}
