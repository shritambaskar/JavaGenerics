package com.generics.demo;

public class LearnGenerics {

	//Generics allows our classes,interfaces or methods to be 
	//parametrised with type info
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {1,2,3,4,5};
		Integer arr[] = {1,2,3,4,5,6};
		print(arr);
		
		String str[] = {"Shrikant","Sonali","Aashish"};
		for (String ch : str) {
			System.out.println(ch);
		}

	}
	
	public static void print(Integer arr[]) {
		
		for (Integer value : arr) {
			System.out.println(value);
		}
		System.out.println("Done....");
	}
	
    public static void print(String arr[]) {
		
		for (String value : arr) {
			System.out.println(value);
		}
		System.out.println("Done....");
	}

}
