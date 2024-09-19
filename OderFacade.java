package com.design.pattern.facade;

public class OderFacade {
	Inventory in=new Inventory();
	Payment pm=new Payment();
	public void placeOrder(String orderId){
		String step1=in.checkInventory(orderId);
		String step2=pm.deductPayment(orderId);
		System.out.println("Step1 and step2 completed"+step1+","+step2);
	}
}
