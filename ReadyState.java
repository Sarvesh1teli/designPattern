package com.design.pattern.state;

public class ReadyState extends Printer{

	@Override
	public void doAction() {
		System.out.println("Printer is ready state");
	}

}
