package com.sms.pojo;

public class StudentPojo {
	
	private int studentId;
	private String studentName;
	private int studentMark;
	private String studentContact;
	
	public StudentPojo(String studentName, int studentMark, String studentContact) {
		super();
		this.studentName = studentName;
		this.studentMark = studentMark;
		this.studentContact = studentContact;
	}
	public StudentPojo(int studentId, String studentName, int studentMark, String studentContact) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMark = studentMark;
		this.studentContact = studentContact;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentMark() {
		return studentMark;
	}
	public void setStudentMark(int studentMark) {
		this.studentMark = studentMark;
	}
	public String getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}
	
	@Override
	public String toString() {
		return "StudentPojo [studentId=" + studentId + ", studentName=" + studentName + ", studentMark=" + studentMark
				+ ", studentContact=" + studentContact + "]";
	}
	
	
}
