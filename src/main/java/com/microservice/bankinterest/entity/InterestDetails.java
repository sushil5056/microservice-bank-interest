package com.microservice.bankinterest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class InterestDetails {
	
	@Id
	@GeneratedValue
	private int id;
	private Long interest;
	private String bankName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getInterest() {
		return interest;
	}
	public void setInterest(Long interest) {
		this.interest = interest;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	@Override
	public String toString() {
		return "InterestDetails [id=" + id + ", interest=" + interest + ", bankName=" + bankName + ", getId()="
				+ getId() + ", getInterest()=" + getInterest() + ", getBankName()=" + getBankName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
