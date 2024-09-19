package com.design.pattern.decorator;

public class ColorDecorator extends DecoratorRoom{

	public ColorDecorator(Room specialRoom) {
		super(specialRoom);
	}

	@Override
	public String showRoom() {
		return specialRoom.showRoom()+addColor();
	}
	
	public String addColor() {
		return "+BLue color";
	}
	
}
