package com.scit.web9.dao;

import java.util.ArrayList;

import com.scit.web9.vo.MemberVO;

public interface MemberMapper {

	public int memberJoin(MemberVO member);
	
	public ArrayList<MemberVO> joinList();
	
	public int memberDelete(String member_id);
	
	public MemberVO memberSelectOne(String member_id);
	
	public int memberUpdate(MemberVO member);
}
