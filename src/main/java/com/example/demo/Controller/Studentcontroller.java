package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student1;
import com.example.demo.Service.Studentservice;




@RestController
public class Studentcontroller {
	@Autowired
	Studentservice s1;
	
	//get
	@GetMapping("/getstud")
	public List<Student1> displayDetail(){
		return s1.getStudDetail();
	}
	
	//post
	@PostMapping("/poststud")
	public String putDetail(@RequestBody Student1 t) {
		s1.add(t);
		return "Added Student details";
	}
	//put
	@PutMapping("/putstud")
	public Student1 updateempp(@RequestBody Student1 fl) {
		return s1.updateStudDetail(fl);
	}
	//delete
	@DeleteMapping("/deletestud")
	public  String deleteInfo(@RequestBody Student1 w) {
		 s1.deleteStudDetail(w);
		 return "Deleted the Student Details";
	}
	

}
