package javatest;

public class _Car {

	public static void main(String[] args) {
		Car car = new Car();
		car.setMake("Porsche"); 
		car.setModel("Carrera"); 
		car.setDoors(2); 
		car.setConvertible(true); 
		car.setColor("Black"); 

		
// 類別為Private無法使用	
// getter &  setter訪問Private	
//		car.make = "Porsche";
//		car.modle = "Carrera";
//		car.color = "Red";
		
		System.out.println("make = " + car.getMake());
		System.out.println("make = " + car.getModel());
		car.describeCar();
		
		Car targa = new Car();
		targa.setMake("Porsche");
		targa.setModel("Targa");
		targa.setDoors(2);
		targa.setConvertible(false);
		targa.setColor("Red");
		
		targa.describeCar();

	}

}
