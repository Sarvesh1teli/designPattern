package com.design.pattern.prototype;

public class PrototypeClient {
	public static void main(String[] args) {
		Person p=new Person("sarvesh");
		System.out.println("original:"+p);
		Person clone=(Person)p.doClone();
		System.out.println("clone:"+clone);

	}

}
