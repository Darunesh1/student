package com.reactboot.student.service;

import java.util.List;

import com.reactboot.student.model.Student;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
