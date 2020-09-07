package com.scit.web9.dao;

import java.util.ArrayList;

import com.scit.web9.vo.MemberVo;

public interface MemberMapper {
	
	public int memberJoin(MemberVo member);
	
	public ArrayList<MemberVo> joinList();
	
	public int memberDelete(String member_id);
	
	
	
	
	
	

}
