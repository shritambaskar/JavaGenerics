package com.generics.demo;

public class ArrayListTest3 {

	public static void main(String[] args) {

		Integer int1 = new Integer(2);
		Integer int2 = new Integer(2);
		
		//"==" operator compares references i.e memory address and does not compare the content
		if (int1.equals(int2)) // (int1 == int2) --return false
		{
			System.out.println("Both are equal");
		}else {
			System.out.println("Not equal");
		}
		
		String str1 = new String("car");
		String str2 = new String("car");
		if (str1.equals(str2)) // (str1 == str2) -- return false 
		{
			System.out.println("Both String are equal");
		}else {
			System.out.println("String are not equal");
		}

	}

}
