package com.design.pattern.prototype;

public class Dog implements Prototype{
String sound;

	public Dog(String sound) {
	super();
	this.sound = sound;
}

	@Override
	public Prototype doClone() {
		return new Dog(sound);
	}

}
