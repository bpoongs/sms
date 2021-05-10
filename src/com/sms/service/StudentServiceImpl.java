package com.sms.service;

import java.util.List;

import com.sms.dao.StudentDao;
import com.sms.dao.StudentDaoImpl;
import com.sms.pojo.StudentPojo;

public class StudentServiceImpl implements StudentService{

	StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new StudentDaoImpl();
	}

	@Override
	public List<StudentPojo> getAllStudents() {
		return studentDao.getAllStudents();
	}

	@Override
	public StudentPojo addStudent(StudentPojo student) {
		return studentDao.addStudent(student);
	}

	@Override
	public boolean deleteStudent(int studId) {
		return studentDao.deleteStudent(studId);
	}

	@Override
	public StudentPojo updateStudent(StudentPojo updatedStudent) {
		return studentDao.updateStudent(updatedStudent);
	}

	@Override
	public StudentPojo getStudent(int studId) {
		return studentDao.getStudent(studId);
	}

}
