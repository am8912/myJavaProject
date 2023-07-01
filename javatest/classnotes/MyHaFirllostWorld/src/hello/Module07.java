package hello;

public class Module07 {

	public static void main(String[] args) {
		int i = 1;
		boolean b =1==2&&i++>2; // i++>2完全不會被運算
		System.out.println(i);
		int c = 0b01000; // 8
		System.out.println(c);
		System.out.println(c>>1); // 0100 -->4  0(x)把最右邊的數字取消掉
		int d = 0b01001; // 9 
		System.out.println(c>>1); // 0100 -->4  1(x)
		System.out.println(d<<1); // 010010 -->18  向左移位，左邊補0
		int d2 = -9;
		System.out.println(Integer.toBinaryString(d2));
		System.out.println(Integer.toBinaryString(d2>>2));
	}

}
