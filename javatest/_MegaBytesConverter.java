package javatest;

public class _MegaBytesConverter {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2500);
	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes>=0) {
			System.out.println( kiloBytes + " KB = " + (kiloBytes / 1024)  + " MB and " + (kiloBytes % 1024) + " KB");
		}else {
			System.out.println("Invalid Value");
		}
	} 
//	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//		int yy = kiloBytes/1024;
//		int zz = kiloBytes%1024;
//	
//		if (kiloBytes < 0) {
//			System.out.println("Invalid Value");
//		}else{
//		    System.out.println(kiloBytes+" KB = "+yy+" MB and "+zz+" KB");
//		}
//    }
}
