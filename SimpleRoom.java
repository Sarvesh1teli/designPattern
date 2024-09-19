package com.design.pattern.decorator;

public class SimpleRoom implements Room{

	@Override
	public String showRoom() {
		//System.out.println("Normal Room");
		return "Normal Room";
	}

}
