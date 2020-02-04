package com.yt.backendbeta.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_follow_up")
public class StudentFollowUp {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(updatable=false,nullable=false)
	private int id;
	@OneToOne//cascade on delete yet to be  applied
	@Column(name="student_id",updatable=false,nullable=false)	
	private Student studentId;
	private Date followUpDate;
	private String staff;
	private int status;
	private String comments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStudentId() {
		return studentId;
	}
	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}
	public Date getFollow_up_date() {
		return followUpDate;
	}
	public void setFollow_up_date(Date follow_up_date) {
		this.followUpDate = follow_up_date;
	}
	public String getStaff() {
		return staff;
	}
	public void setStaff(String staff) {
		this.staff = staff;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "StudentFollowUp [id=" + id + ", studentId=" + studentId + ", follow_up_date=" + followUpDate
				+ ", staff=" + staff + ", status=" + status + ", comments=" + comments + "]";
	}
	
}
