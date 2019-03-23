package com.bridgeit.valueAndrequired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args)
	{
		
     ApplicationContext context=new ClassPathXmlApplicationContext("beans4.xml");
     Student student=context.getBean("student",Student.class);
     student.displayingStudentInfo();
	}

}
