package com.generics.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		HashSet<ModelDemo> studentSet1 = new HashSet<ModelDemo>();
		studentSet1.add(new ModelDemo("s1", 101, "s1@gmail.com"));
		studentSet1.add(new ModelDemo("s2", 102, "s2@gmail.com"));
		studentSet1.add(new ModelDemo("s3", 103, "s3@gmail.com"));
		studentSet1.add(new ModelDemo("s4", 104, "s4@gmail.com"));	
		
		
		LinkedHashSet<ModelDemo> studentSet2 = new LinkedHashSet<ModelDemo>();
		studentSet2.add(new ModelDemo("s1", 101, "s1@gmail.com"));
		studentSet2.add(new ModelDemo("s2", 102, "s2@gmail.com"));
		studentSet2.add(new ModelDemo("s3", 103, "s3@gmail.com"));
		studentSet2.add(new ModelDemo("s4", 104, "s4@gmail.com"));
		
		studentSet1.forEach(System.out::println);
		System.out.println("\n \n");
		studentSet2.forEach(System.out::println);

	}

}
