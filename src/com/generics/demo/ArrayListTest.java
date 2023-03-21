package com.generics.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Yellow");
		colorList.add("Green");
		
//		System.out.println("\n.....Using For each loop....");
//		
//		for (String color : colorList) {
//			System.out.println(color);
//		}
		
//		System.out.println(".....Using Iterator....");
//		Iterator<String> itr = colorList.iterator();
//		while (itr.hasNext()) {
//			String color = itr.next();
//			System.out.println(color);
//		}
		
		System.out.println(".....Using for Loop.....");
		for (int i = 0; i < colorList.size(); i++) {
			System.out.println(colorList.get(i));
		}
		

	}

}
