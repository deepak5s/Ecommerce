package com.project.Backend.Indus1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class User {
	@Id
	@GeneratedValue
	private String username;
	private String password,Role,Email,Address,Model;
	private String CustFirstName,CustLastName;
	boolean Enabled;
	public boolean isEnabled() {
		return Enabled;
	}
	public void setEnabled(boolean enabled) {
		Enabled = enabled;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getCustFirstName() {
		return CustFirstName;
	}
	public void setCustFirstName(String custFirstName) {
		CustFirstName = custFirstName;
	}
	public String getCustLastName() {
		return CustLastName;
	}
	public void setCustLastName(String custLastName) {
		CustLastName = custLastName;
	}
	
	
	
}
