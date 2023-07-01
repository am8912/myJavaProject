package javatest;

public class _TeenNumberChecker {

	public static void main(String[] args) {
		hasTeen(22,23,24);
		System.out.println(hasTeen(22,23,24));
		isTeen(15);
		System.out.println(isTeen(15));
	}
	public static boolean hasTeen(int x,int y,int z) {
		if(x<=19 && x>= 13) {
			return true;
		}else if(y<=19 && y>= 13) {
			return true;
		}else if(z<=19 && z>= 13){
			return true;
		}else {
			return false;
		}	
	}
	public static boolean  isTeen(int age) {
		if(age <= 19 && age >=13) {
			return true;
		}else{
			return false;
		}
	}
}
