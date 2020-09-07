package com.scit.web9.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web9.dao.MemberDAO;
import com.scit.web9.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO dao;
	@Autowired
	private HttpSession session;
	
	public String memberJoin(MemberVO member) {
		int cnt = dao.memberJoin(member);			
		
		String page ="";
		if(cnt == 0) {
			page = "redirect:/member/joinFail";
		} else {
			page = "redirect:/";
		}
		
		return page;
		
	}
	
	public ArrayList<MemberVO> joinList() {
		//로그인 체크 처리 이 곳에서도 가능
		ArrayList<MemberVO> list = dao.joinList();
	
		return list;
	}
	
	public int memberDelete(String member_id) {
		int cnt = dao.memberDelete(member_id);
		
		return cnt;	
	}
	
	public MemberVO memberSelectOne(String member_id) {
		MemberVO member = dao.memberSelectOne(member_id);
		
		return member;
	}
	
	public int memberUpdate(MemberVO member) {
		int cnt = dao.memberUpdate(member);
		
		return cnt;
	}
	
	public String memberLogin(MemberVO member) {
	  
	  MemberVO loginCheck = dao.memberSelectOne(member.getMember_id());
	  
	  //로그인 성공 여부에 따라서 리턴될 값 
	  String page = "";
	  
	  //로그인 성공
	  //사용자는 id를 입력했는데 loginCheck 객체가 null일 경우가 발생
	  if(loginCheck != null && loginCheck.getMember_pw().equals(member.getMember_pw())) { 
	  
		  //SessionScope가 필요한 상황 -> HttpSession객체가 SessionScope
		  session.setAttribute("loginId", member.getMember_id()); 
		  //메인 페이지로 redirect를 해야 한다 
		  page = "redirect:/";
	 
	 //로그인 실패
	  }else { 
		  
		 page = "redirect:/member/loginForm"; 
	  
	  }
	  return page; 
	  
	  }
	  
	  public void memberLogout() { 
	  //session에서 로그인 정보를 삭제하는 기능
 	  //session.invalidate는 전체 삭제, 	
	  //session.removeAttribute는 하나씩 삭제 
	  session.removeAttribute("loginId");
	 
	 }
	 

}

