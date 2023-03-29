package com.generics.demo;

import java.util.Objects;

public class ModelDemo {

	private String name;
	private Integer empId;
	private String email;
	
	
	
	public ModelDemo(String name) {
		super();
		this.name = name;
	}

	public ModelDemo() {
		super();
	}

	public ModelDemo(String name, Integer empId, String email) {
		super();
		this.name = name;
		this.empId = empId;
		this.email = email;
	}

	public ModelDemo(String name, Integer empId) {
		super();
		this.name = name;
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ModelDemo [name=" + name + ", empId=" + empId + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, empId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelDemo other = (ModelDemo) obj;
		return Objects.equals(email, other.email) && Objects.equals(empId, other.empId)
				&& Objects.equals(name, other.name);
	}

	
	
	
}
