package com.venkydemo.spring.Service;

public class Employee {
	private String Name;
	private int Id;
	private double Sal;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getSal() {
		return Sal;
	}

	public void setSal(double sal) {
		Sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Id=" + Id + ", Sal=" + Sal + "]";
	}

}
