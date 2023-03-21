package com.generics.demo;

import java.util.Objects;

public class MyStudent {

	private String name;
	private Integer rollno;
	
	public MyStudent(String name, Integer rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "MyStudent [name=" + name + ", rollno=" + rollno + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyStudent other = (MyStudent) obj;
		return Objects.equals(name, other.name) && Objects.equals(rollno, other.rollno);
	}
	
	
	
}
