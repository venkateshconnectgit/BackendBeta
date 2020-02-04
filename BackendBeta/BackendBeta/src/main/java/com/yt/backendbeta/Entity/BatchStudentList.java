package com.yt.backendbeta.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="batch_list")
public class BatchStudentList {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(updatable=false,nullable=false)
	private int id;
	@OneToMany//TODO cascade on delete yet to be  applied
	private List<Student> students = new ArrayList<Student>();
	@OneToOne//TODO cascade on delete yet to be  applied
	private Faculty faculty;
	@OneToOne
	private Batch batchId;
	private Date startDate;
	private Date completionDate;
	@OneToMany
	private List<Student> students_discontinued = new ArrayList<Student>();
	public int getId() {
		return id;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public Batch getBatchId() {
		return batchId;
	}
	public void setBatchId(Batch batchId) {
		this.batchId = batchId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}
	public List<Student> getStudents_discontinued() {
		return students_discontinued;
	}
	public void setStudents_discontinued(List<Student> students_discontinued) {
		this.students_discontinued = students_discontinued;
	}
	@Override
	public String toString() {
		return "BatchStudentList [num=" + id + ", students=" + students + ", faculty=" + faculty + ", batchId="
				+ batchId + ", startDate=" + startDate + ", completionDate=" + completionDate
				+ ", students_discontinued=" + students_discontinued + "]";
	}

	
}
