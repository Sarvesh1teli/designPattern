package com.design.pattern.decorator;

public class CurtainDecorator extends DecoratorRoom{

	public CurtainDecorator(Room specialRoom) {
		super(specialRoom);
	}
	@Override
	public String showRoom() {
		return specialRoom.showRoom()+addCurtain();
	}
	
	public String addCurtain() {
		return "+BLue Curtain";
	}
}
