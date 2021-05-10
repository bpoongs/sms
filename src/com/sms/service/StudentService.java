package com.sms.service;

import java.util.List;

import com.sms.pojo.StudentPojo;

public interface StudentService {

	public List<StudentPojo> getAllStudents();
	
	public StudentPojo addStudent(StudentPojo student);
	
	public boolean deleteStudent(int studId);
	
	public StudentPojo updateStudent(StudentPojo updatedStudent);
	
	public StudentPojo getStudent(int studId);
}
