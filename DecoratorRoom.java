package com.design.pattern.decorator;

public abstract class DecoratorRoom implements Room{
	protected Room specialRoom;

	public DecoratorRoom(Room specialRoom) {
		super();
		this.specialRoom = specialRoom;
	}
	@Override
	public String showRoom() {
		return specialRoom.showRoom();
	}
	
}
