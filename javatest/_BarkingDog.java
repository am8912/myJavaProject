package javatest;

public class _BarkingDog {

	public static void main(String[] args) {
		shouldWakeUp(false,6);
		System.out.println(shouldWakeUp(false,6));
	}
	public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
		if(hourOfDay < 0 || hourOfDay > 23) {
			return false;
		}else if(barking && (hourOfDay < 8 || hourOfDay > 22)) {
			return true;
		}else{
			return false;
		}
	}

}
