package com.design.pattern.decorator;

public class Decorator {
	public static void main(String[] args) {
		Room room=new  ColorDecorator(new CurtainDecorator(new SimpleRoom()));
		System.out.println(room.showRoom());
	}

}
