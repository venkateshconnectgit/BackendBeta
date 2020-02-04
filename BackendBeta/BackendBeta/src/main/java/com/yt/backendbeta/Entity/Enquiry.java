package com.yt.backendbeta.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enquiry")
public class Enquiry {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false,updatable=false)
	private int id;
	@Column(name="enquiry_id",nullable=false,updatable=false)
	private String enquiryId;
	private String name;
	@Column(name="phone_number",nullable=false)
	private String phoneNumber;
	private String email;
	@Column(name="enquired_date",nullable=false)
	private Date enquiredDate;
	@Column(name="enquired_about",nullable=false)
	private String enquiredbout;
	private String comment;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(String enquiryId) {
		this.enquiryId = enquiryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getEnquiredDate() {
		return enquiredDate;
	}
	public void setEnquiredDate(Date enquiredDate) {
		this.enquiredDate = enquiredDate;
	}
	public String getEnquiredbout() {
		return enquiredbout;
	}
	public void setEnquiredbout(String enquiredbout) {
		this.enquiredbout = enquiredbout;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Enquiry [id=" + id + ", enquiryId=" + enquiryId + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", enquiredDate=" + enquiredDate + ", enquiredbout=" + enquiredbout
				+ ", comment=" + comment + "]";
	}

	
	
}
