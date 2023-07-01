package javatest;

public class _EqualSumChecker {

	public static void main(String[] args) {
		hasEqualSum(1,-1,0);
		System.out.println(hasEqualSum(1,-1,0));
	}
	public static boolean hasEqualSum(int firstNum,int secondNum,int thirdNum) {
		if(firstNum + secondNum == thirdNum) {
			return true;
		}else if(firstNum + secondNum != thirdNum) {
			return false;
		}else {
			return false;
		}	
	}
//	public static boolean hasEqualSum (int No1,int No2,int No3){
//        if((No1 + No2)== No3){
//            return true;
//        }else {
//            return false;
//        }
//    }
}
