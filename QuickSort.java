package com.design.pattern.strategy;

public class QuickSort implements Strategy{

	@Override
	public void sort(int[] a) {
		System.out.println("sorting array using QuickSort sort");		
	}

}