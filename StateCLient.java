package com.design.pattern.state;

public class StateCLient {
	public static void main(String[] args) {
		Context ctx=new Context();
		Printer readyState=new ReadyState();
		ctx.setPrinter(readyState);
		ctx.doAction();
		
		Printer sleepState=new SleepState();
		ctx.setPrinter(sleepState);
		ctx.doAction();
	}

}
