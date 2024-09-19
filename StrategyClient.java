package com.design.pattern.strategy;

public class StrategyClient {
public static void main(String[] args) {
	int a[]={1,3,4,5,6};
	Context ctx=new Context();
	Strategy sort=new BubbleSort();
	ctx.setStrategy(sort);
	ctx.arrange(a);
	
	sort=new QuickSort();
	ctx.setStrategy(sort);
	ctx.arrange(a);
	
	sort=new MergeSort();
	ctx.setStrategy(sort);
	ctx.arrange(a);
}

}
