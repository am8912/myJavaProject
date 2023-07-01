package javatest;

public class Test24 {

	public static void main(String[] args) {
		
		MembUser user = new MembUser();
		System.out.println(user.getStatus());
		System.out.println(user.getCompid());
		System.out.println(user.getUserid());
		
		// 在method上按F3會跳到所使用的constructor
		
		MembUser user2 = new MembUser("023997652","SL008");
		System.out.println(user2.getStatus());
		System.out.println(user2.getCompid());
		System.out.println(user2.getUserid());
		
//		user.setCompid("23997652"); // 使用者網頁上輸入的值
//		user.setUserid("SL001");
//		user.setUserName("測試帳號");
//		user.setEmail("test@gmail.com");
//		user.setMobile("0912345678");
//		user.setStatus(MembUser.STATUS_USER_NORMAL);
//		user.setUpdUid(null); // 更新者代碼(第一次註冊沒有更新者代碼)
//		user.setUpdDt("2023/06/24");	
//		user.setIsAdmin(null); 
		
		
	}

}
