package com.generics.demo;

public class PrintSum<T extends Number> {

	public void print(T[] arr) {
		//logic
		double sum = 0;
		for (T x : arr) {
			sum = sum + x.doubleValue();//this method is of class Number so we can use it
		}
		
		System.out.println("Sum = "+sum);
	}
//	
//	ArrayList implements List
//	Vector implements List
//	LinkedList implements List
//	
//	Stack extends Vector
	
	//List -- Duplicate values are allowed , Insertion order is maintained(FIFO)
	
	//Set -- Duplicate values are not allowed, Insertion order is not maintained exception is LinkedHashSet
	
	//Map -- Used to store data in Key Value pairs, Duplicate values are allowed but duplicate keys are not allowed
	         //Insertion order is not maintained exception is LinkedHashMap
}
