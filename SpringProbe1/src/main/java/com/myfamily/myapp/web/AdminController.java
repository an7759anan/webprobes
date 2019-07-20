package com.myfamily.myapp.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.myfamily.myapp.domain.User;
//import com.myfamily.myapp.domain.UserRole;
import com.myfamily.myapp.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService adminService;

	@RequestMapping("/admin/users")
	public String listUsers(Map<String, Object> map) {

		map.put("userList", adminService.listUser());

		return "userList";
	}
	
	@RequestMapping("/admin/users/add")
	public String getEmptyUserForm (Map<String, Object> map) {
		map.put("user", new User());
		return "user";
	}
	
	@RequestMapping(value = "/admin/users/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user,
			BindingResult result) {
		user.setEnabled(1);
		adminService.addUser(user);

		return "redirect:/admin/users";
	}

	@RequestMapping("/admin")
	public String home() {
		return "redirect:/admin/users";
	}

	@RequestMapping("/admin/users/delete/{username}")
	public String deleteContact(@PathVariable("username") String username) {

		adminService.removeUser(username);

		return "redirect:/admin/users";
	}
}
