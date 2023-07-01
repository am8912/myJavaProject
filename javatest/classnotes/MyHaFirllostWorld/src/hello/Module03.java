package hello;

public class Module03 {

	public static void main(String[] args) {
		System.out.println("\""); // "\"跳脫字元，只能用在字串裡，是文字，不符合命名規範。
		System.out.println('\''); // "\"跳脫字元，只能用在字串裡，是文字，不符合命名規範。
		System.out.println("\\"); // "\"跳脫字元，只能用在字串裡，是文字，不符合命名規範。
		System.out.println("aaa\tbbb");
		System.out.println("aaaa\tbbb");
		
		// 換行
		System.out.println("AAA\nBBB");
		System.out.println("AAA\rBBB");
		System.out.println("AAA\r\nBBB");
	}
	
}
