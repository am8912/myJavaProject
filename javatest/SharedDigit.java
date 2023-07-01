package javatest;

public class SharedDigit {

	public static void main(String[] args) {
		
	}
	 public static boolean hasSharedDigit(int num01, int num02) {
		  if(num01<10 && num02<10) {
		   return false;
		  }
		  if(num01>99 && num02>99) {
		   return false;
		  }		
		  int i;
		     while(i<num01 || i<num02) {
		      
		      i %= 10;
		     }
		  
		  return false;
		 }
}
