package com.generics.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Yellow");
		colorList.add("Green");
		colorList.add("Blue");
		 
		
		// chang by vishal
		
		List<Integer> marksList = new ArrayList<Integer>();
		marksList.add(55);
		marksList.add(18);
		marksList.add(78);
		marksList.add(79);
		
		System.out.println(" - - - - -to iterat the marks array list - - - - - -");
		
		for(int i=0; i< marksList.size(); i++) {
				System.out.println(marksList.get(i));
		}
		
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
        System.out.println("vishal");

	}

}
