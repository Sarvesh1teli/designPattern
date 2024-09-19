package com.design.pattern.builder;

public class BuilderClient {
	public static void main(String[] args) {
		Cake whitecake=new Cake.Builder().sugar(2).bakingPowder(2).butter(2).cherry(1).eggs(5).flour(2)
		.milk(5).vanilla(1).build();
		System.out.println(whitecake );
	}

}
