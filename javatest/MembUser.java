package javatest;

public class MembUser {
	// Static Fields
	public static final String STATUS_USER_NORMAL = "1"; // final 最終的結果
	public static final String  STATUS_USER_LOCK = "9";
	
	private String compid; // 公司統編
	
	private String userid; // 使用者代碼

	private String userName; // 使用者名稱

	private String email; 

	private String tel; // 傳真

	private String mobile; // 電話

	private String status; // 狀態

	private String updUid; // 更新人員

	private String updDt; // 更新日期

	private String isAdmin; // 是否為管理員

	private String isApi;
	
	public MembUser() {
		
	} // 已有下方建構子，所以上面要空的建構子
	
	public MembUser(String compid,String userid) {
		// super(); 已經沒有在使用
		// 預設初始值
		// this.status = status;
		this.status = MembUser.STATUS_USER_NORMAL;
		this.compid = compid;
		this.userid = userid;
		
	}


	public String getCompid() {
		return compid;
	}

	public void setCompid(String compid) {
		this.compid = compid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpdUid() {
		return updUid;
	}

	public void setUpdUid(String updUid) {
		this.updUid = updUid;
	}

	public String getUpdDt() {
		return updDt;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getIsApi() {
		return isApi;
	}

	public void setIsApi(String isApi) {
		this.isApi = isApi;
	}
}