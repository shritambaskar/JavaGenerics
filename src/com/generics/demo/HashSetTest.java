package com.generics.demo;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> colorSet = new HashSet<String>();
//		colorSet.add("Red");
//		colorSet.add("Green");
//		colorSet.add("Blue");
//		//Now if we add again
//		colorSet.add("Red");
//		for (String color : colorSet) {
//			System.out.println(color);
//		}
		
//		colorSet.add("Red");
		
		System.out.println(colorSet.add("Red"));
		System.out.println(colorSet.add("Green"));
		System.out.println(colorSet.add("Blue"));
		
		System.out.println(colorSet.add("Red"));

	}

}
