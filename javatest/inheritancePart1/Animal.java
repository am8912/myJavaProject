package javatest.inheritancePart1;

public class Animal {
	private String type;
	private String size;
	private double weight;
	
	public Animal(String type, String size, double weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	public void move(String speed) {
		System.out.println(type + ", speed:" + speed);
		
	}
	public void makeNoise() {
		System.out.println(type + ", make some kind of noise");
	}
}
