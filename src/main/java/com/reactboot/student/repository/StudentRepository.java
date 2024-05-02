package com.reactboot.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reactboot.student.model.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer> {

}
