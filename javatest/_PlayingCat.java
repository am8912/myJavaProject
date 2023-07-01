package javatest;

public class _PlayingCat {

	public static void main(String[] args) {
			System.out.println(isCatPlaying(true,45));
	}
	public static boolean isCatPlaying(boolean summer, int temperature){
		if(summer) {
			if(temperature >= 25 && temperature <= 45) {
				return true;
			}else {
				return false;
			}
		}else {
			if(temperature >= 25 && temperature <= 35) {
				return true;
			}else {
				return false;
			}
		}
	}
//		if(temperature >= 25 && temperature <= 35){
//			System.out.println(1);
//			return true; 
//		}else if(summer && temperature > 35 && temperature <=45) {
//			System.out.println(2);
//			return false;
//		}else if(summer && temperature >= 25 && temperature <= 35) {
//			System.out.println(3);
//			return true;
//		}else if(!summer && temperature >= 35 && temperature <=45){
//			System.out.println(4);
//			return true;
//		}else {
//			System.out.println("else");
//			return false;
//		}
	
	
}