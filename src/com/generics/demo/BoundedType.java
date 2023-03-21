package com.generics.demo;

public class BoundedType {

	public static void main(String[] args) {
	Integer intArray[] = {10,34,56,12,23};
	PrintSum<Integer> psInteger = new PrintSum<Integer>();
	psInteger.print(intArray);
	
	Double doubleArray[] = {10.34,34.56,78.90,25.67};
	PrintSum<Double> dbArray = new PrintSum<Double>();
	dbArray.print(doubleArray);
	
	String strSrray[] = {"Shri","Utkarsh","Sanjana","Rahul"};
	PrintString<String> stringArray = new PrintString<String>();
	stringArray.print(strSrray);

	}

}
