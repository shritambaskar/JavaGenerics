package com.generics.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {

	public static void main(String[] args) {
		
		HashSet<ModelDemo> modelSet = new HashSet<ModelDemo>();
		modelSet.add(new ModelDemo("s1", 101, "s1@gmail.com"));
		modelSet.add(new ModelDemo("s2", 102, "s2@gmail.com"));
		modelSet.add(new ModelDemo("s3", 103, "s3@gmail.com"));
		modelSet.add(new ModelDemo("s4", 104, "s4@gmail.com"));	
		modelSet.add(new ModelDemo("s2", 102, "s2@gmail.com"));
		modelSet.add(new ModelDemo("s1", 101, "s1@gmail.com"));
		
//		for (ModelDemo value : modelSet) {
//			System.out.println(value);
//			
//		}
		
//		Iterator<ModelDemo> itr = modelSet.iterator();
//		while (itr.hasNext()) {
//			ModelDemo modelDemo = itr.next();
//			System.out.println(modelDemo);
//			
//		}
		
		
		if(modelSet.isEmpty()) {
			System.out.println("No Data Found");
		}else {
			
			modelSet.forEach(System.out::println);
			System.out.println(modelSet.size());
			
			modelSet.remove(new ModelDemo("s3", 103, "s3@gmail.com"));
			
			System.out.println("After Using Remove Method");
			
			modelSet.forEach(System.out::println);
			System.out.println(modelSet.size());
		}
		//Lambda Expresion- include from Java 1.8
//		modelSet.forEach(System.out::println);
//		System.out.println(modelSet.contains(new ModelDemo("s5", 101,"s1@gmail.com")));
//		
//		modelSet.clear();
//		modelSet.forEach(System.out::println);
//		System.out.println("Done");

	}

}
