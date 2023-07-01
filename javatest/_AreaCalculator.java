package javatest;

public class _AreaCalculator {

	public static void main(String[] args) {
		area(5);
		System.out.println(area(5));
		area(6,10);
		System.out.println(area(6,10));
	}
	public static double area(double radius) {
		if(radius < 0) {
			return -1.0;
		}
		return Math.PI * radius * radius;
	}
	public static double area(double x, double y) {
		if(x < 0 || y < 0) {
			return -1.0;
		}
		return x * y;
	}
}
