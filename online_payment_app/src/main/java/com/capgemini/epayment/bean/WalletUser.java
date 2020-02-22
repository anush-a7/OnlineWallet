package com.capgemini.epayment.bean;

import java.util.HashMap;
import java.util.Map;

public class WalletUser {
	private int userId;
	private String username;
	private String phoneNumber;
	private String password;

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername() {
		this.username = username;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "CreateAccount [userId=" + userId + ", username=" + username + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + "]";
	}

}
