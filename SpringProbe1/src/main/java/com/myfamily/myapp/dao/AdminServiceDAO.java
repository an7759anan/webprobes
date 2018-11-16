package com.myfamily.myapp.dao;

import java.util.List;

import com.myfamily.myapp.domain.User;

public interface AdminServiceDAO {
	public List<User> listUser();
	public void addUser(User user);
	public void removeUser(String username);
}
