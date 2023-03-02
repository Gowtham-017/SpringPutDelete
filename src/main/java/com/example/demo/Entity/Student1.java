package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="empDetails")
public class Student1 {
	@Id
	private int id;
	private String studentName;
	private String deptname;
	private String mailid;
	
	
	
	public Student1(int id, String studentName, String deptname, String mailid) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.deptname = deptname;
		this.mailid = mailid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public Student1() {
		
	}
	public String toString() {
		return "id="+id+"studentName="+studentName+"deptname="+deptname+"mailid="+mailid;
	}

}
