package javatest;

import java.util.ArrayList;
import java.util.List;
import javatest.MembUser;

public class Test25 {

	public static void main(String[] args) {
//		MembUser user; // (=null)	
	
	// 假設是從資料庫取出來，使用者清單
	List<MembUser> userList = new ArrayList<MembUser>();

	
	for(int i = 0;i<userList.size();i++) {
		// 取出該清單的第i筆資料
		MembUser user = userList.get(i);
		// 如果使用使用者的status = "1"，跳過不處理(只處理被鎖住的)
		if(MembUser.STATUS_USER_NORMAL.equals(user.getStatus())) {
			continue; // 跳過、繼續
//			break; 找到任何一筆正常使用者，整個迴圈就會break掉(停掉)，只對上一層迴圈有作用。
		}
		// 針對帳號被鎖住的寄送通知信
	}
		
	
	}
}
