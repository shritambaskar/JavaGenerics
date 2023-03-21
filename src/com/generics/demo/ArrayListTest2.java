package com.generics.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		//This will create Empty array list
//		List<String> arr = new ArrayList<>();
//		System.out.println("Siz of array list is "+arr.size());
		
		
		//Some more Methods of Array List
		ArrayList<String> colorlist1 = new ArrayList<String>();
		
		if (colorlist1.isEmpty()) {
			colorlist1.add("Red");
			colorlist1.add("Blue");
			colorlist1.add("Green");
			colorlist1.add("Yellow");
		}
		
//		colorlist1.clear();
//		
//		if (colorlist1.isEmpty()) {
//			colorlist1.add("Black");
//		}
		
//		System.out.println("Size of colorlist1 is "+colorlist1.size());
//		System.out.println(colorlist1.isEmpty());
		
		ArrayList<String> colorlist2 = new ArrayList<String>();
		colorlist2.add("Purple");
		colorlist2.add("Pink");
		colorlist2.add("Blue");
		colorlist2.add("Red");
		
//		System.out.println(colorlist1.contains("Black"));
//		System.out.println("\nSize of colorlist2 is "+colorlist2.size());
//		
//		System.out.println("Lets Print colorlist1");
//		for (String color : colorlist1) {
//			System.out.println(color);
//		}
//		
//		
//		
//		System.out.println("\nLets Print colorlist2");
//		for (String color : colorlist2) {
//			System.out.println(color);
//		}
//		
//		System.out.println("\nColorlist1 after addAll()");
		
//		colorlist1.addAll(colorlist2);
//		System.out.println("\nSize of colorlist1 is "+colorlist1.size());
//		System.out.println("\nLets Print colorlist1");
//		for (String color : colorlist1) {
//			System.out.println(color);
//		}
//		
//		System.out.println("\n Colorlist1 after removeAll()");
//		colorlist1.removeAll(colorlist2);
//		System.out.println("\nLets Print colorlist1");
//		for (String color : colorlist1) {
//			System.out.println(color);
//		}
//		System.out.println("\nSize of colorlist1 is "+colorlist1.size());
		
		System.out.println("Colorlist 1 after retainAll()");
		colorlist1.retainAll(colorlist2);
		for (String color : colorlist1) {
			System.out.println(color);
		}

	}

}
