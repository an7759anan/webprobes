package com.myfamily.myapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LAUSERS")
public class User {
	
	@Id
	@Column(name = "USERNAME")
	private String username;
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username=username;
	}

	@Column(name = "PASSWORD")
	private String password;
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return this.password;
	}

	@Column(name = "ENABLED")
	private Integer enabled;
	public void setEnabled(Integer enabled) {
		this.enabled=enabled;
	}
	public Integer getEnabled() {
		return this.enabled;
	}

}
