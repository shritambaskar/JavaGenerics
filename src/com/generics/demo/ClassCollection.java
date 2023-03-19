package com.generics.demo;

import java.util.ArrayList;

public class ClassCollection {

	public static void main(String[] args) {
		
		//Type Safety
		Integer arr[] = new Integer[10];
		arr[0] = 10;
		arr[1] = 20;
		//arr[2] = "Shrikant";
		
		//Generic Version --- ArrayList<E>
		//Non Generic Version - ArrayList
		
		//Non Generic Version
		ArrayList list = new ArrayList();
		list.add(10); //0
		list.add(10.10f); //1
		list.add("Shrikant");//2
		list.add(true);//3
		
		int v = (Integer)list.get(0);
		float f = (float)list.get(1);
		
		
		
		//Generic Version
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		arrList.add(50);
//		arrList.add(10.10f);
//		arrList.add("Shrikant");
//		arrList.add(true);
		
		int value = arrList.get(0);

	}

}
