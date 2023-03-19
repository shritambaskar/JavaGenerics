package com.generics.demo;

public class GenericsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer intArr[] = {1,2,3,4,5,6};
		PrintArray<Integer> printArray = new PrintArray<Integer>();
		printArray.print(intArr);
		
		String stringArr[] = {"Ram","Shrikant","Anu","Sanjana","Rutuja"};
		PrintArray<String> printString = new PrintArray<String>();
		printString.print(stringArr);
		
	
	}
		
}

class PrintArray<T>{
	public void print(T []arr) //T : formal type arguement
	{
		for (T val : arr) {
			System.out.println(val);
		}
	}
}
