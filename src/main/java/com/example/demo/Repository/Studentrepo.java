package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Student1;







@Repository
public interface Studentrepo extends JpaRepository<Student1,Integer>{

}
