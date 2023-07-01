package javatest;
/*
 * Object Oriented Programming (OOP)
 * Public(公共的)、Private(私人的)、Protected(受保護的)
 */
public class Car { //屬性
	private String make = "Tesla";
	private String model = "Model X";
	private String color = "Gray";
	private int doors = 2;
	private boolean convertible = true;
	
// 右鍵SOURCE
// 方法
// getter method 取出
	
	public String getMake() { // 前面沒有用static 後面S也不能用
		return make;
	}
	public String getModel() { 
		return model;
	}
	public String getColor() { 
		return color;
	}
	public int getDoors() { 
		return doors;
	}
	public boolean getConvertible() { 
		return convertible;
	}
// set method 更改成員	
// this調用當前物件的其他方法
	public void setMake(String make) {
	    if (make == null) make = "Unknown";
	    String lowercaseMake = make.toLowerCase();
	    switch (lowercaseMake) {
	        case "holden":
	        case "porsche":
	        case "tesla":
	            this.make = make;
	            break;
	        default:
	            this.make = "Unsupported";
	            break;
	    }
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}
	
	public void describeCar() {
		System.out.print(doors + "-Door " + 
						 color + " " + 
				         make + " " + 
						 model + " " +
				         (convertible ? "Convertible":""));
	}
	

}
