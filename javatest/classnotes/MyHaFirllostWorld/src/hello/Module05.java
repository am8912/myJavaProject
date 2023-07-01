package hello;

public class Module05 {

	public static void main(String[] args) {
		int a = 100; // 基本資料型別(沒有功能)
		int b = 3;
		Object o = a/b; // 參考資料型別(有功能)
		System.out.println(o);
		System.out.println(o.getClass().getSimpleName());
		double c = 60.5d;
		double d = 50.5d;
		Object e =c-d;
		System.out.println(e);
		System.out.println(e.getClass().getSimpleName());
		int f = 5;
		double g = 20.0;
		Object h = f+g;
		System.out.println(h);
		System.out.println(h.getClass().getSimpleName());
		byte N = 3;
		short j = 35;
		Object k = N * j;
		System.out.println(k);
		System.out.println(k.getClass().getSimpleName());
		 
		int t_1 = 1; // 2147483647
		short s_1 = (short)t_1; // 不確定數值能否放入，強制轉型。
		long m_1 = (long)t_1; // 不一定每次都有用
		int i = 1;
		System.out.println(i+++i);
//		System.out.println(""+i+++i); 
		int lg = 10;
		int gt = 50;
		boolean 消到火珠 = true;
		boolean 消到心珠 = false;
		boolean 開門 = true;
		System.out.println(!開門); // !只能作用在boolean值
		
		
//		System.out.println(lg>gt); // false
//		System.out.println(lg<gt); // true
//		System.out.println(lg!=gt); // true
//		System.out.println(lg>=gt); // false
//		System.out.println(lg<=gt); // true
		
		System.out.println("倍率=" + (消到火珠 || 消到心珠));
		System.out.println("倍率=" + (消到火珠 && 消到心珠));
	
		
		
	}

}
