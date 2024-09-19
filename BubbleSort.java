package com.design.pattern.strategy;

public class BubbleSort implements Strategy{

	@Override
	public void sort(int[] a) {
		System.out.println("sorting array using bubble sort");		
	}

}
