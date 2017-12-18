package com.laye.entity;

import javax.persistence.Entity;

@Entity
public class Contact {
	
	String name;
	String phone;
	
	public Contact() {
		super();
	}
	public Contact(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
