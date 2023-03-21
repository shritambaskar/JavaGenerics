package com.generics.demo;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		
		Student studentArray[] = new Student[10];//machine specific
		studentArray[0] = new Student("Sanjana", 1);
		studentArray[1] = new Student("Girija", 2);
		
		//studentArray[2] = new Teacher("Shrikant", 3);
		//here we got compile time error
		Student student1 = studentArray[0];
		System.out.println(student1);
		
		//Non Generic Version
		ArrayList list1 = new ArrayList();
		list1.add(new Student("Sanjana", 1));//0
		list1.add(new Student("Girija", 2));//1
		list1.add(new Teacher("Shrikant",3));//2
		Student student2 = (Student)list1.get(1);//Perfect
		
		//Generic Version
		//size = 10 , size = size/2 + 1;
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Sanjana", 1));
		studentList.add(new Student("Girija", 2));
		studentList.add(new Student("Shrikant", 3));
		
		//studentList.add(new Teacher("Ram", 4));
		
		Student student3 = studentList.get(0);
		

	}

}
