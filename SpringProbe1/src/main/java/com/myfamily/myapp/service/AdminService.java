package com.myfamily.myapp.service;

import java.util.List;

import com.myfamily.myapp.domain.User;

public interface AdminService {
	public List<User> listUser();
	public void addUser(User user);
	public void removeUser(String username);
}
