package com.scit.web9;

public class userVo {

	private String userid;
	private String userpw;
	
	public userVo() {
		super();
	}
	public userVo(String userid, String userpw) {
		super();
		this.userid = userid;
		this.userpw = userpw;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	@Override
	public String toString() {
		return "userVo [userid=" + userid + ", userpw=" + userpw + "]";
	}
	
	
	
}
