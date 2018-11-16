package com.myfamily.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myfamily.myapp.dao.AdminServiceDAO;
import com.myfamily.myapp.domain.User;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminServiceDAO adminServiceDAO;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
    @Transactional
	@Override
	public List<User> listUser() {
    	return adminServiceDAO.listUser();
	}

    @Transactional
	@Override
	public void addUser(User user) {
    	user.setPassword(passwordEncoder.encode(user.getPassword()));
    	adminServiceDAO.addUser(user);
	}

    @Transactional
	@Override
	public void removeUser(String username) {
    	adminServiceDAO.removeUser(username);
	}
}
