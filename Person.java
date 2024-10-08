package com.design.pattern.prototype;

public class Person implements Prototype{

	String name;
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Prototype doClone() {
		return new Person(name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
