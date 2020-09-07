package com.scit.web9.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web9.dao.MemberDao;
import com.scit.web9.dao.MemberMapper;
import com.scit.web9.vo.MemberVo;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	
public String memberJoin(MemberVo member) {
		
		
		int cnt = dao.memberJoin(member);
		
		String page = "";
		
		if(cnt == 0) {
			page = "redirect:/member/joinFail";
		}else {
			page = "redirect:/";
		}
		
		return page;	
	}

public ArrayList<MemberVo> joinList(){
	
	
	ArrayList<MemberVo> list = dao.joinList();
	
	return list;
}

public int memberDelete(String member_id) {
	
	int cnt = dao.memberDelete(member_id);
	
	return cnt;
}

}
