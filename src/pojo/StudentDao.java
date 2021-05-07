package pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	List<StudentPojo> allStudents;
	
	public StudentDao(){
		StudentPojo stud1 = new StudentPojo(101, "Praveen", 40, "33333333333");
		StudentPojo stud2 = new StudentPojo(102, "Priya", 50, "66666666666");
		StudentPojo stud3 = new StudentPojo(103, "Ram", 45, "7777777777");
		
		allStudents = new ArrayList<StudentPojo>();
		allStudents.add(stud1);
		allStudents.add(stud2);
		allStudents.add(stud3);
	}
	
	public List<StudentPojo> getAllStudents(){
		return allStudents;
	}
	
	public StudentPojo addStudent(StudentPojo student) {
		student.setStudentId(allStudents.get(allStudents.size()-1).getStudentId() + 1);
		allStudents.add(student);
		return student;
	}
	
	public boolean deleteStudent(int studId) {
		boolean flag = false;
		for(StudentPojo student: allStudents) {
			if(student.getStudentId() == studId) {
				flag = true;
				allStudents.remove(student);
				break;
			}
		}
		return flag;
	}
	
	public StudentPojo updateStudent(StudentPojo updatedStudent) {
		for(int i=0; i<allStudents.size(); i++) {
			if(allStudents.get(i).getStudentId() == updatedStudent.getStudentId()) {
				allStudents.set(i, updatedStudent);
				break;
			}
		}
		return updatedStudent;
	}
}
