package javatest;

public class Test01 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		//變數
		//型態 名稱 值
		//在Java內，等於(=)不等於相等，是分配(assigned)
		
		//宣告 Expressions
		int a = (10 + 5) + (2 * 10);
		a = a-30;
		System.out.println(a);
		
		//-------------------------------------
		boolean boo = true;
		short sor = 500;
		double dou = 10.5;
		System.out.println(boo);
		System.out.println(sor);
	    System.out.println(dou);
	    
	    //int最大值
	    System.out.println(Integer.MAX_VALUE);
	    
	    //int最小值
	    System.out.println(Integer.MIN_VALUE);
	    
	    //casting
	    long belong = 900;
	    a = (int) belong;
	    System.out.println(a);
	    
	    //----------------------------------------
	    
	    int aa = 10;
	    
	    String str = "這是我的/aa";
	    String str2 = ", Tom";
	    
	    System.out.println(str + str2);
	    System.out.println("Hello World!!"+ " Tom");
	    
	    
	    //3-17------------------------------------------
	   System.out.println("Hello Tim !");
	   
	   int myFirstName = 5 ;
	   System.out.println("myFirstName");
	   System.out.println(myFirstName);
	   myFirstName = 10;
	   System.out.println(myFirstName);
	   myFirstName = 1000;
	   System.out.println(myFirstName);
	  
	   int abc = 10 + 5 ;
	   System.out.println(abc);
	   abc = (10+5) + (2*10);
	   System.out.println(abc);
	   int def = 12 ;
	   int ght = 6 ;
	   int myTotal = abc + def + ght ;
	   System.out.println(myTotal);
	   ght = abc *2 ;
	   myTotal = abc + def + ght ;
	   System.out.println(myTotal);
	   int fij = 1000 ;
	   myTotal = fij - (abc + def + ght) ;
	   System.out.println(myTotal);
	   fij = 1000 - myTotal ;
	   System.out.println(fij);
	   int myvalue = 10000;
	   int myIntMinValue = Integer.MIN_VALUE;
	   System.out.println(myIntMinValue);
	   int myIntMaxValue = Integer.MAX_VALUE;
	   System.out.println(myIntMaxValue);
	   System.out.println("Integer Minimum Value = " + Integer.MIN_VALUE);
	   System.out.println("Integer Minimum Value = " + myIntMinValue);
	   System.out.println("Integer Value Range ("+ Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
	   
	   //在最大值上+1是不可行的，顯示為負數最小值，上溢循環
	   System.out.println("Busted Max Value = " + (myIntMaxValue + 1));
	   //反之亦然，在最小值-1，不可行，顯示為最大值，下溢循環
	   System.out.println("Busted Min Value = " + (myIntMinValue - 1));
	   //使用適當的數據類型才能避免上述情況
	   
	   System.out.println("Intger Maximum Value = " + (Integer.MAX_VALUE));
	   //int myMaxIntTest = 2147483648;(數字大於int最大值，報錯無法執行)
	   
	   //int myMaxIntTest = 2,147,483,647;(Java裡的數字不能放","但可以放"_")
	   int myMaxIntTest = 2_147_483_647;
	   System.out.println(myMaxIntTest);
	   
	   //3-18------------------------------------------
	   System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
	   System.out.println("Byte Value Range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
	   System.out.println("Short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
	   //Integer>Short>Byte
	   
	   long myLongValue = 100 ;
	   System.out.println("A long has width of " + Long.SIZE);
	   System.out.println("Long Value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
	   //Long Value Range (-9223372036854775808 to 9223372036854775807)
	   long bigLongLiteralValue = 2_147_483_647;
	   System.out.println(bigLongLiteralValue);
	   //long bigLongLiteralValue = 2_147_483_647_234;(Java會當作是Integer整數，過大的數字需用L結尾)
	   bigLongLiteralValue = 2_147_483_647_234L;
	   System.out.println(bigLongLiteralValue);
	   
	   //Short bigShortLiteralValue = 32768;(報錯，超出short的最大值)
	   Short bigShortLiteralValue = 32767;
	   System.out.println(bigShortLiteralValue);
	   
	   //3-19------------------------------------------
	   short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE; 
	   System.out.println(myMinShortValue);
	   System.out.println(myMinIntValue);
	   
	   //byte myMinByteValue = Byte.MIN_VALUE, byte myMaxByteValue = Byte.MAX_VALUE;(變數相同且用","應省略第2個變數Byte)
	   byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
	   System.out.println(myMinByteValue);
	   System.out.println(myMaxByteValue);
	   
	   
	   //short firstShort = 1 , int fistInteger = 2;(不同的變數不能用","要用";")
	   short firstShort = 1 ; int fistInteger = 2;
	   System.out.println(firstShort);
	   System.out.println(fistInteger);
	   
	   int mytotal =(Integer.MIN_VALUE /2);
	   System.out.println(mytotal);
	   
	   //byte myNewByteValue123 = (Byte.MIN_VALUE / 2);(Byte.MIN_VALUE被Java當作int整數所以無法執行，所以要在加(byte)告知java)
	   byte myNewByteValue123 = (byte)(Byte.MIN_VALUE / 2);
	   System.out.println(myNewByteValue123);
	   
	   
	   short myNewShortValue = (Short.MIN_VALUE / 2);
	   System.out.println(myNewShortValue);
	   //short myNewShortValue = (short)(Short.MIN_VALUE / 2);(可多加(short)加強java指令)
	   System.out.println(myNewShortValue);
		
	   //3-20------------------------------------------
	   byte newbyte = 10;
	   short newshort = 20;
	   int newinteger = 30;
	   long newLong = 5000L + 10L * (newbyte + newshort + newinteger);
	   System.out.println(newLong);
	   
	   //3-21------------------------------------------
	    
	   //數字精確度double>float
	   System.out.println("Float Value Range (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + " )");
	   //Float Value Range (1.4E-45 to 3.4028235E38 ) 1.4E-45 表示1.4X10-45
	   System.out.println("Double Value Range (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + " )");
	   //Double Value Range (4.9E-324 to 1.7976931348623157E308 )
	   int myIntValue = 5;
	   float myFloatValue = 5;
	   double myDoubleValue = 5;
	   //5
	   System.out.println(myIntValue); 
	   //5.0
	   System.out.println(myFloatValue);
	   //5.0
	   System.out.println(myDoubleValue);
	   
	   //在數字最後+變數第一字母可加強Java辨識
	   myFloatValue = 5F;
	   myDoubleValue = 5D;
	   System.out.println(myFloatValue);
	   System.out.println(myDoubleValue);
	   
	   //float myOtherFloatValue = 5.25; x
	   //float myOtherFloatValue = (float) 5.25; O
	   //float myOtherFloatValue = 5.25F; O
	   float myOtherFloatValue = 5.25F;
	   System.out.println(myOtherFloatValue);
	   
	   float myE = 5e1F;
	   System.out.println(myE);
	   //e=*10，5e1=5*10的1次方，F或D家在最後會多小數點增加數字精確度
	   
	   myIntValue = 5/2;
	   System.out.println(myIntValue);
	   //2
	   myFloatValue = 5F/2F;
	   System.out.println(myFloatValue);
	   //2.5
	   myDoubleValue = 5D/2D;
	   System.out.println(myDoubleValue);
	   //2.5
	   
	   myIntValue = 5/3;
	   System.out.println(myIntValue);
	   //1
	   myFloatValue = 5F/3F;
	   System.out.println(myFloatValue);
	   //1.6666666
	   myDoubleValue = 5D/3D;
	   System.out.println(myDoubleValue);
	   //1.6666666666666667
	   myDoubleValue = 5.00/3.00;
	   System.out.println(myDoubleValue);
	   //1.6666666666666667
	   //myFloatValue = 5.00/3F; 報錯，Java會認定5.00為double
	   
	   double onePound = 0.45359237D ;
	   System.out.println("onePound = " + onePound );
	   //onePound = 0.45359237
	   
	   double numberOfPounds = 200d;
	   System.out.println(numberOfPounds);
	   
	   double convertedKlogram = numberOfPounds * 0.45359237D; 
	   System.out.println(convertedKlogram);
	   System.out.println("converted kilograms = " + convertedKlogram); 
	   //converted kilograms = 90.718474
	   
	   double pi = 3.1415927d;
	   System.out.println(pi);
	   
	   double anotherNumber = 3_000_000.4_567_890d;
	   System.out.println(anotherNumber);
	   //3000000.456789
	   
	   //3-23------------------------------------------
	   
	   char mychar = 'D';
	   System.out.println(mychar);
	   
	   char myunicode = '\u0044';
	   System.out.println(myunicode);
	   //D
	   myunicode = '\u2460';
	   System.out.println(myunicode);
	   //① 在''內輸入Unicode碼，U+0041(A)，改成'\u0041'。
	   
	   char mychar1 = 68;
	   System.out.println(mychar1);
	   //D
	   
	   char mySimpleChar = '?';
	   System.out.println(mySimpleChar);
	   char myUnicodeChar = '\u003F';
	   System.out.println(myUnicodeChar);
	   char myDecimalChar = 63;
	   System.out.println(myDecimalChar);
	   System.out.println("my value are " + mySimpleChar + myUnicodeChar + myDecimalChar);
	   //my value are ???
	   
	   boolean myTrueBooleanValue = true;
	   System.out.println(myTrueBooleanValue);
	   boolean myFalseBooleanValue = false;
	   System.out.println(myFalseBooleanValue);
	   
	   //3-24------------------------------------------
	   String myString = "This is a string";
	   System.out.println(myString);
	   System.out.println("myString is equal to " + myString);
	   //myString is equal to This is a string
	   myString = myString + ", and this is more. ";
	   System.out.println("myString is equal to " + myString);
	   //myString is equal to This is a string, and this is more. 
	   myString = "I wish I had \u00241,000,000.00";
	   System.out.println(myString);
	   //I wish I had $1,000,000.00貨幣符號可以去查它的Unicode代碼ex;\u0024為美幣
	   
	   String numberString = "250.55";
	   numberString = numberString + "49.45";
	   System.out.println(numberString);
	   //250.5549.45並沒有相加
	   //int myInt = "10";報錯int不需要""
	   
	   String lastString = "10";
	   int myInt = 50;
	   System.out.println(lastString + myInt);
	   //1050
	   double doubleNumber = 120.47;
	   lastString = lastString + myInt;
	   lastString = lastString + doubleNumber;
	   System.out.println(lastString);
	   //1050120.47數字不會做運算，string是字串
	   
	   //3-25------------------------------------------	   
	   
	   int result = 1 + 2;
	   System.out.println(result);
	   //3
	   int prviousResult = result;
	   System.out.println(prviousResult);
	   result = result - 1;
	   System.out.println(result);
	   //2
	   System.out.println(prviousResult);
	   //3
	   
	   char firstChar = 'A', secondChar = 'B';
	   System.out.println(firstChar + secondChar);
	   //131(A、B分別65、66)
	   System.out.println(""+firstChar + secondChar);
	   //AB
	   
	   result = 2;
	   System.out.println(result);
	   //2
	   result = result * 10;
	   System.out.println(result);
	   //20
	   result = result / 4;
	   System.out.println(result);
	   //5
	   
	   result = 5;
	   result = 5 % 3;
	   System.out.println(result);
	   //2 (%為餘數運算，結果為除不進的數字)
	   
	   result = 1;
	   result = result + 1;
	   System.out.println(result);
	   //2
	   result = 1;
	   result++;
	   System.out.println(result);
	   //2
	   result = 1;
	   result+=1;
	   System.out.println(result);
	   //2(+1兩種寫法都可以)
	   
	   result = 1;
	   result--;
	   System.out.println(result);
	   //0
	   result = 1;
	   result-= 1;
	   System.out.println(result);
	   //0(反之亦然，兩種寫法都可以)
	   
	   int Result = 10;
	   Result-=5;
	   System.out.println(Result);
	   
	   result = 10;
	   result -= 5.5;
	   System.out.println(result);
	   //4
	   
	   result = 10;
	   result = (int)(result-5.5);
	   System.out.println(result);
	   //4
	   
	   double resulttest = 10;
	   resulttest -= 5.5;
	   System.out.println(resulttest);
	   //4.5
	  
	   resulttest = 10;
	   resulttest *= 1.5;
	   System.out.println(resulttest);
	   //15.0
	   
	   resulttest = 10;
	   resulttest /= 1.5;
	   System.out.println(resulttest);
	   //6.666666666666667
	   
	   //5-1------------------------------------------
	   
	   
	}

}




