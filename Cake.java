package com.design.pattern.builder;

public class Cake {
	
	private  double sugar;
	private  double butter;
	private  int  vanilla;
	private  int eggs;
	private  double milk;
	private  double flour;
	private  double bakingPowder;
	private  int cherry;
	public static class Builder{
		private  double sugar;
		private  double butter;
		private  int  vanilla;
		private  int eggs;
		private  double milk;
		private  double flour;
		private  double bakingPowder;
		private  int cherry;
		
		public Builder sugar(double cup){
			this.sugar=cup;
			return this;
		}
		public Builder butter(double butter){
			this.butter=butter;
			return this;
		}
		public Builder vanilla(int vanilla){
			this.vanilla=vanilla;
			return this;
		}
		public Builder eggs(int eggs){
			this.eggs=eggs;
			return this;
		}
		
		public Builder milk(double milk){
			this.milk=milk;
			return this;
		}
		public Builder flour(double flour){
			this.flour=flour;
			return this;
		}
		public Builder bakingPowder(double bakingPowder){
			this.bakingPowder=bakingPowder;
			return this;
		}
		public Builder cherry(int cherry){
			this.cherry=cherry;
			return this;
		}
		
		public Cake build(){
			return new Cake(this);
		}
		
	}
	public Cake(Builder builder) {
		this.sugar =builder.sugar;
		this.butter =builder.butter;
		this.vanilla =builder.vanilla;
		this.eggs =builder.eggs;
		this.milk =builder.milk;
		this.bakingPowder =builder.bakingPowder;
		this.flour =builder.flour;
		this.cherry =builder.cherry;
	}
	@Override
	public String toString() {
		return "Cake [bakingPowder=" + bakingPowder + ", butter=" + butter
				+ ", cherry=" + cherry + ", eggs=" + eggs + ", flour=" + flour
				+ ", milk=" + milk + ", sugar=" + sugar + ", vanilla="
				+ vanilla + "]";
	}
	
}
