package com.design.pattern.facade;

public class FacadeClient {
	public static void main(String[] args) {
		OderFacade o=new OderFacade();
		o.placeOrder("1234");
		System.out.println("order placed successfully");
	}

}
