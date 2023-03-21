package com.generics.demo;

import java.util.ArrayList;

public class ArrayListTest4 {

	public static void main(String[] args) {
		
		ArrayList<MyStudent> studentList1 = new ArrayList<MyStudent>();
		studentList1.add(new MyStudent("Sanajana", 101));
		studentList1.add(new MyStudent("Utkarsh", 102));
		studentList1.add(new MyStudent("Rahul", 103));
		
		ArrayList<MyStudent> studentList2 = new ArrayList<MyStudent>();
		studentList2.add(new MyStudent("Vishal", 101));
		studentList2.add(new MyStudent("Girija", 104));
		studentList2.add(new MyStudent("Shri", 105));
		
//		System.out.println("Student List 1");
//		for (MyStudent myStudent : studentList1) {
//			System.out.println(myStudent);
//		}
//		
//		System.out.println("Student List 2");
//		for (MyStudent myStudent : studentList2) {
//			System.out.println(myStudent);
//		}
		
		studentList1.addAll(studentList2); 
		//studentlist 1 = [Sanajana Utkarsh Rahul Vishal Girija Shri]
		//Now first we use removeAll() and print it 
		
//		studentList1.removeAll(studentList2);
//		//studentlist 1 = [Sanajana Utkarsh Rahul]
//		System.out.println("Student List 1");
//		for (MyStudent myStudent : studentList1) {
//			System.out.println(myStudent);
//		}

		studentList1.retainAll(studentList2);
		//studentlist 1 = []
		System.out.println("Student List 1");
		for (MyStudent myStudent : studentList1) {
			System.out.println(myStudent);
		}
	}

}
