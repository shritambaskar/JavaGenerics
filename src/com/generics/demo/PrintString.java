package com.generics.demo;

public class PrintString<E extends String> {

	public void print(E []arr) {
		for (E str : arr) {
			System.out.println("Name is "+str);
		}
	}
}
