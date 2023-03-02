package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student1;
import com.example.demo.Repository.Studentrepo;


@Service
public class Studentservice {
	@Autowired
	Studentrepo f;
	
	//add
	public String add(Student1 g) {
		f.save(g);
		return "Added";
	}
	
	//get
	public List<Student1> getStudDetail(){
		return f.findAll();
	}
	
	//update
	public Student1 updateStudDetail(Student1 v) {
		return f.saveAndFlush(v);
	}
	
	//delete
	public void deleteStudDetail(Student1 v1) {
		f.delete(v1);
	}

}
