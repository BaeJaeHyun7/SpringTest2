package com.scit.web5.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.scit.web5.vo.MemberVO;

@Service
public class MemberService {
	
	//DB의 역활을 잠시동안 대신해줄 list
	private ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	
	public String memberJoin(MemberVO member) {
		
		int cnt = 1;
		String page = "";
		boolean flag = false;
		
		for(MemberVO v : list) {
			if(v.getUser_id().equals(member.getUser_id())) {
				cnt = 0;
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			list.add(member);
		}
		
		
		if(cnt == 0) {
			page ="member/joinFail";
		} else {
			page ="member/joinComplete";
		}
		
		return page;
	}
	
	public ArrayList<MemberVO> memberList(){
		return list;
	}
	
	public void memberDelete(String user_id) {
		
		int index = 0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getUser_id().equals(user_id)) {
				index = i;
			}
		}
		
		list.remove(index);
		
		
	}
	
}
