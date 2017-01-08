package com.yangtze.film.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo extends BaseEntity {

	@Id
	private String account;
	
	private String email;
	
	private String password;
	
	private String salt;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
