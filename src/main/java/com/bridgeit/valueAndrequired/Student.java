package com.bridgeit.valueAndrequired;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
 @Value("${student.name}")
 private String name;
 
 @Value("${student.intrestingCourse}")
 private String intrestingCourse;
 
 @Value("${student.hobby}")
 private String hobby;
 

//public void setName(String name) {
//	this.name = name;
//}
//
//@Value("${student.intrestingCourse}")
//public void setIntrestingCourse(String intrestingCourse) {
//	this.intrestingCourse = intrestingCourse;
//}
//@Value("${student.hobby}")
//public void setHobby(String hobby) {
//	this.hobby = hobby;
//}
 public void displayingStudentInfo()
 {
	 System.out.println("student name : "+name);
	 System.out.println("student course : "+intrestingCourse);
	 System.out.println("student hobby : "+hobby);
 }
 
}
