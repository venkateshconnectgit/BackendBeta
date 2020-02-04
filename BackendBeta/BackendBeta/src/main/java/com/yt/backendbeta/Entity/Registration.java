package com.yt.backendbeta.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration {

	//TODO caching yet to be done
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,nullable=false)
	private int id;
	@Column(name="registration_id",updatable = false,nullable=false)
	private String registrationId;//TODO cascade on delete yet to be added
	private NameFormat name;
	private String gender;
	private int age;
	private String phone;
	private String email;
	private String address;
	private int student;
	private String institute;
	private String qualification;
	private List<Course> course = new ArrayList<Course>();
	private int totalFee;
    private int feePaid;	
	private int feeDue;
	private Date registeredDate;
	private int courseCompletionStatus;
	private Date passoutDate;
	private String source;

	public String getStudentId() {
		return registrationId;
	}
	public void setStudentId(String studentId) {
		this.registrationId = studentId;
	}
	public NameFormat getName() {
		return name;
	}
	public void setName(NameFormat name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStudent() {
		return student;
	}
	public void setStudent(int student) {
		this.student = student;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	public int getFeePaid() {
		return feePaid;
	}
	public void setFeePaid(int feePaid) {
		this.feePaid = feePaid;
	}
	public int getFeeDue() {
		return feeDue;
	}
	public void setFeeDue(int feeDue) {
		this.feeDue = feeDue;
	}
	public Date getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	public int getCourseCompletionStatus() {
		return courseCompletionStatus;
	}
	public void setCourseCompletionStatus(int courseCompletionStatus) {
		this.courseCompletionStatus = courseCompletionStatus;
	}
	public Date getPassoutDate() {
		return passoutDate;
	}
	public void setPassoutDate(Date passoutDate) {
		this.passoutDate = passoutDate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", student_id=" + registrationId + ", name=" + name + ", gender=" + gender
				+ ", age=" + age + ", phone=" + phone + ", email=" + email + ", address=" + address + ", student="
				+ student + ", institute=" + institute + ", qualification=" + qualification + ", course=" + course
				+ ", total_fee=" + totalFee + ", fee_paid=" + feePaid + ", fee_due=" + feeDue + ", registered_date="
				+ registeredDate + ", course_completion_status=" + courseCompletionStatus + ", passout_date=" + passoutDate
				+ ", source=" + source + "]";
	}
	
	

}
