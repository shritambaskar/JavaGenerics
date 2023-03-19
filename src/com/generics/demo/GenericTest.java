package com.generics.demo;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		
		Student studentArray[] = new Student[10];
		studentArray[0] = new Student("Sanjana", 1);
		studentArray[1] = new Student("Girija", 2);
		
		//studentArray[2] = new Teacher("Shrikant", 3);
		//here we got compile time error
		
		//Non Generic Version
		ArrayList list1 = new ArrayList();
		list1.add(new Student("Sanjana", 1));//0
		list1.add(new Student("Girija", 2));//1
		list1.add(new Teacher("Shrikant",3));//2
		
		//Generic Version
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Sanjana", 1));
		studentList.add(new Student("Girija", 2));
		studentList.add(new Student("Shrikant", 3));
		
		//studentList.add(new Teacher("Ram", 4));
		

	}

}
