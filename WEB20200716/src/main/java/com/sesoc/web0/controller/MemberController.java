package com.sesoc.web0.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesoc.web0.service.MemberService;
import com.sesoc.web0.vo.MemberVo;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/member/joinForm", method = RequestMethod.GET)
	public String joinForm() {
		System.out.println("회원 가입 폼 이동");
		return "member/joinForm";
	}
	
	
	
	@RequestMapping(value = "/member/join", method = RequestMethod.POST)
	public String MemberJoin(MemberVo member) {
		
		String page = "";
		
		if(memberService.sameIdCheck(member)) {
			page = "member/joinFail";
			
		}else {
			
			page = memberService.MemberJoin(member);
		}
		
		
		return page;
		
	}
	
	@RequestMapping(value = "/member/listForm", method = RequestMethod.GET)
	public String listForm(MemberVo member, Model model) {
		System.out.println("회원 목록 확인 이동");
		
				
		ArrayList<MemberVo>list = memberService.list;
		model.addAttribute("list", list);		
		return "member/listForm";
	}
	

	
	
	
	
	
	

}
