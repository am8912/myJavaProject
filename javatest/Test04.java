package javatest;

public class Test04 {

	public static void main(String[] args) {
		// 55-43--------------------------------------
		
		// if(condition) {
		  // Code in block will execute only if condition is true
		  // block can contain 1 or many statements
	    // }
		boolean gameover = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		// 練習
		// if(score == 5000) {
	    // System.out.println("You score was 5000"); 
		// }
		// You score was 5000
			
		// if(condition) {
			// Code in block will execute only if condition is true
			//}else{
			// Code in block will execute only if condition is false
		// }
		
		// if(score <= 5000) {
		//	System.out.println("Your score was less than 50000");
		// }else{
		//  System.out.println("Got here");
		// Got here
		
		// if(score <= 5000) {
		//	System.out.println("Your score was less than or equal to 5000");
		//	}else{
		//	System.out.println("Got here");
		// Your score was less than or equal to 5000	
			
		// 說明******************************
		// if(firstCondition) {
			// Code in block will execute only if fistCondition is true
		// }else if(secondCondition) {
			// Code in block will execute if firstCondition is false and secondCondition is true
		// THERE IS NO LIMIT TO THE NUMBER OF CONDITIONS THAT CAN BE TESTED
		
		// }else {
			// Code in block will execute if all condition above are false
		// THE ELSE BLOCK MUST BE LAST BUT IS OPTIONAL	
		// 說明******************************
		
		if(score < 5000 && score > 1000) {
			System.out.println("Your score was less than 5000 but greater than 1000");
		}else if(score < 1000) {	
			System.out.println("Your score was less than 1000");
		}else{
			System.out.println("Got here");
		// Got here
		}
		
				

	}

}
