package com.design.pattern.state;

public class SleepState  extends Printer{

	@Override
	public void doAction() {
		System.out.println("Printer is sleep state");
	}

}