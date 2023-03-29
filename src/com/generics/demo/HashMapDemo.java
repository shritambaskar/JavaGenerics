package com.generics.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> colorMap = new HashMap<Integer,String>();
		
		colorMap.put(1, "Sanjana");//1.Entry
		colorMap.put(2, "Utkarsh");//2.Entry
		colorMap.put(3, "Vishal");//3.Entry
		colorMap.put(4, "Rahul");//4.Entry
		//colorMap.put(5, "Rahul");//4.Entry, duplicate value allows
		colorMap.put(5, "Shrikant");//4.Entry
		
		if (colorMap.containsKey(1)) {
		     colorMap.put(1,"Girija");
		 }
		
		if (colorMap.containsKey(4) && Objects.equals(colorMap.get(4), "Rahul")) {
		     colorMap.remove(4);
		}
		
		if (colorMap.containsKey(5) && Objects.equals(colorMap.get(5), "Shrikant")) {
			colorMap.put(5, "Ashwini");
		}
		

		 for (Map.Entry<Integer,String> entry : colorMap.entrySet()) {
			 
			 System.out.println("Keys :"+entry.getKey()+" Value "+ entry.getValue());
		 }

	}

}
