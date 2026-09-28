package com.jspiders.constructors;

public class Chocolate {
	
	int barCode;
	String name;
	int weight;
	int cost;
	
	Chocolate(int barCode,String name,int weight,int cost)
	{
		this.barCode=barCode;
		this.cost=cost;
		this.name=name;
		this.weight=weight;
	}
	public int getBarCode() {
		return barCode;
	}
	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public static void main(String[] args) {
		
		Chocolate c=new Chocolate(101,"Cadbury",12,10);
		System.out.println(c.getBarCode());
		System.out.println(c.getCost());
		System.out.println(c.getName());
		System.out.println(c.getWeight());
		
		System.out.println("*****Modified values****");
		
		c.setBarCode(102);
		c.setName("Hershey's");
		c.setCost(50);
		c.setWeight(20);
		
		System.out.println(c.getBarCode());
		System.out.println(c.getCost());
		System.out.println(c.getName());
		System.out.println(c.getWeight());
	}

}
