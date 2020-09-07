package com.scit.web5.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.web5.service.MemberService;
import com.scit.web5.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberServie;
	
	@RequestMapping(value="/member/joinForm", method=RequestMethod.GET)
	public String memberJoinForm() {
		System.out.println("회원 가입 폼 이동");
		return "member/joinForm";
	}
	
	@RequestMapping(value="/member/join" , method = RequestMethod.POST)
	public String memberJoin(MemberVO member) {
		String page = memberServie.memberJoin(member);
		return page;
	}
	
	@RequestMapping(value="/member/joinList" , method = RequestMethod.GET)
	public String memberJoinList(Model model) {
		
		ArrayList<MemberVO> list = memberServie.memberList();
		model.addAttribute("list", list);
		
		return "member/joinList";
	}
	
	@RequestMapping(value="/member/delete" , method = RequestMethod.GET)
	public String memberDelete(Model model,String user_id) {
		memberServie.memberDelete(user_id);
		ArrayList<MemberVO> list = memberServie.memberList();
		model.addAttribute("list", list);
		
		return "member/joinList";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
