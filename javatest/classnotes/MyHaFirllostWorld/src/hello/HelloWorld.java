package hello;

public class HelloWorld {
	public static void main(String[] args) {
		int a = 0b11; //3;  // 0011;  1=true
		System.out.println(a);
		int b = 0b1100; //12; // 1100; 0=false
		            
		int c = 0b0101;// 5; // 0101
		
		System.out.println(b);
		System.out.println(3&12); // 0000
		
		System.out.println(c);
		System.out.println(Integer.toBinaryString(b&c)); // 數字轉為二進制
		System.out.println(Integer.toBinaryString(b|c));
		System.out.println(Integer.toBinaryString(b^c)); // 互斥或 相同就是0
		System.out.println(Integer.toBinaryString(~b)); // not 運算 "~"只作用在數值
		//4bytes=>32bits
		 
		
	}
}
