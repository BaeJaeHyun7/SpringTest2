package com.sesoc.web0.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sesoc.web0.vo.MemberVo;

@Service
public class MemberService {

public ArrayList<MemberVo> list = new ArrayList<MemberVo>();
	
	public String MemberJoin(MemberVo member) {
		
		list.add(member);
		
		
		int cnt = 1;
		
		for(MemberVo v : list) {
			System.out.println(v);
		}
		
		String page = "";
		
		if(cnt == 0) {
			page = "member/joinFail";
		}else {
			page = "member/joinComplete";
		}
		
		return page;
	}
		
		public boolean sameIdCheck(MemberVo member) {
			boolean idCheck = false;
			for(MemberVo sameMember : list) {
				if(sameMember.getId().equals(member.getId())) {
					idCheck = true;
				}
			}return idCheck;
		}
		
		
	
}
