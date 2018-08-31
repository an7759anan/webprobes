package com.myfamily.myapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACTS")

public class Contact {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	public Integer getId() {
		return this.id;
	}

	@Column(name = "FIRSTNAME")
	private String firstname;
	public void setFirstname(String firstName) {
		this.firstname=firstName;
	}
	public String getFirstname() {
		return this.firstname;
	}

	@Column(name = "LASTNAME")
	private String lastname;
	public void setLastname(String lastName) {
		this.lastname=lastName;
	}
	public String getLastname() {
		return this.lastname;
	}

	@Column(name = "EMAIL")
	private String email;
	public void setemail(String email) {
		this.email=email;
	}
	public String getemail() {
		return this.email;
	}

	@Column(name = "TELEPHONE")
	private String telephone;
	public void setTelephone(String telephone) {
		this.telephone=telephone;
	}
	public String getTelephone() {
		return this.telephone;
	}
}
