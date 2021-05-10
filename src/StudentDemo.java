import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sms.dao.StudentDao;
import com.sms.dao.StudentDaoImpl;
import com.sms.pojo.StudentPojo;
import com.sms.service.StudentService;
import com.sms.service.StudentServiceImpl;


public class StudentDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//StudentDao studentDao = new StudentDao();
		//StudentDao studentDao = new StudentDaoImpl();
		
		StudentService studentService = new StudentServiceImpl();
		char repeat = 'n';
		
		do {
			System.out.println("************************************");
			System.out.println("Student Management System");
			System.out.println("************************************");
			System.out.println("1. Display all students.");
			System.out.println("2. Add a new Student.");
			System.out.println("3. Remove a Student.");
			System.out.println("4. Update Contact Number.");
			System.out.println("5. Exit.");
			System.out.println("************************************");
			System.out.print("Enter your option : ");
			int option = scan.nextInt();
			System.out.println("************************************");
			
			switch(option) {
			case 1:
				List<StudentPojo> myStudents = studentService.getAllStudents();
				for(StudentPojo student: myStudents) {
					System.out.println(student);
				}
				System.out.println("************************************");
				System.out.print("Do you want to continue?(y/n)");
				repeat = scan.next().charAt(0);
				System.out.println("************************************");
				break;
				
			case 2:
				System.out.print("Please enter Student Name: ");
				String sName = scan.next();
				System.out.print("Please enter Student Mark: ");
				int sMark = scan.nextInt();
				System.out.println("Please enter Student Contact: ");
				String sContact = scan.next();
				
				StudentPojo studentPojo = new StudentPojo(sName, sMark, sContact);
				StudentPojo addedStudent = studentService.addStudent(studentPojo);
				System.out.println("Student added Successfully!!");
				System.out.println("New student id is : " + addedStudent.getStudentId());
				System.out.println("************************************");
				System.out.print("Do you want to continue?(y/n)");
				repeat = scan.next().charAt(0);
				System.out.println("************************************");
				break;

			case 3:
				System.out.print("Please enter Student Id: ");
				int sId = scan.nextInt();
				boolean status = studentService.deleteStudent(sId);
				if(status) {
					System.out.println("Student removed successfuly!!");
				}
				else {
					System.out.println("Student Id not found!!");
				}
				System.out.println("************************************");
				System.out.print("Do you want to continue?(y/n)");
				repeat = scan.next().charAt(0);
				System.out.println("************************************");
				break;
				
			case 4:
				System.out.print("Please enter Student Id: ");
				int studId = scan.nextInt();
				StudentPojo oldStudent = studentService.getStudent(studId);
				System.out.println("Student details are :");
				System.out.println(oldStudent);
				System.out.print("Please enter new contact no :");
				String contact = scan.next();
				oldStudent.setStudentContact(contact);
				StudentPojo updatedStudent = studentService.updateStudent(oldStudent);
				System.out.println("Updated details are :");
				System.out.println(updatedStudent);
				System.out.println("************************************");
				System.out.print("Do you want to continue?(y/n)");
				repeat = scan.next().charAt(0);
				System.out.println("************************************");
				break;
				
			case 5:
				System.exit(0);	
			}
		}while(repeat == 'y');
	}

}
