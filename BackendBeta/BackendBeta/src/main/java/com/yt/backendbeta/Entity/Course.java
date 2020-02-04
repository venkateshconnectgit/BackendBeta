package com.yt.backendbeta.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(updatable=false,nullable=false)
	private int id;
	@Column(name="course_id",nullable=false)
	private String courseId;
	private String courseName;
	private String courseSyllabus;
	public int getId() {
		return id;
	}	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseSyllabus() {
		return courseSyllabus;
	}
	public void setCourseSyllabus(String courseSyllabus) {
		this.courseSyllabus = courseSyllabus;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", course_id=" + courseId + ", courseName=" + courseName + ", courseSyllabus="
				+ courseSyllabus + "]";
	}

	
	
}
