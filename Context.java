package com.design.pattern.strategy;

public class Context {
	Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void arrange(int a[]){
		strategy.sort(a);
	}
}
