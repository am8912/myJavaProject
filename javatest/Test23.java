package javatest;

import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		
		int currentYear = 2022;
		try{
			System.out.println(getInputConsole(currentYear));
		}catch(NullPointerException e){
		System.out.println(getInputScanner(currentYear));
		}
// 處理異常（exceptions）的概念	
// 		try{
//statements that might get errors
// 		}catch(Exception e){
//code to "handle" the exception
// 		}
		
//	   wrapper包裝紙 : Integer、Double 
//	   wrapper Method : parseInt(String)、parseDouble(String)
		
//		int currentYear = 2022;
//		String userDataOfBirth = "1999";
//		int dateOfBirth = Integer.parseInt(userDataOfBirth);
//	 
//		System.out.println("Age = " + (currentYear - dateOfBirth));
//		
//		String userAgeWithPatrialYear = "22.5";
//		double ageWithPatrialYear = Double.parseDouble(userAgeWithPatrialYear);
//		System.out.println("The user says he's " + ageWithPatrialYear);
	}
	public static String getInputConsole(int currentYear) {
		
		String name = System.console().readLine("Hi, What's your name? ");
		System.out.println("Hi " + name + ", Thanks for taking the course! ");
		String dateOfBirth = System.console().readLine("What year were you born ?");
		int age = currentYear - Integer.parseInt(dateOfBirth);
		return "So you are " + age + "years old";
		
	}
// ClassName variableName = new ClassName(argument1, argument2);
// Scanner sc = new Scanner(System.in);
// Scanner sc = new Scanner(new File("nameOfFileOnFileSystem"));
	
	public static String getInputScanner(int currentYear) {
		Scanner scanner = new Scanner(System.in);
		
//		String name = System.console(),readLine("Hi, What's your Name? ");
		System.out.println("Hi, What's your Name? ");
		String name = scanner.nextLine();
		
		System.out.println("Hi " + name + ", Thanks for taking the course!");

//		String dateofBirth = System.console().readLine("What year were you born? ");
		System. out.println("What year were you born? ");
		String dateOfBirth = scanner.nextLine();
		int age = currentYear - Integer.parseInt(dateOfBirth);
		
		return "So you are " + age + " years old";
	}

	
	
	
	
// java src/Main.java	
}
		


