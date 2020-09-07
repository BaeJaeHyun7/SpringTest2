package com.scit.web9.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.web9.service.MemberService;
import com.scit.web9.vo.MemberVO;

@Controller
@RequestMapping(value="/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService service;
	
	
	@RequestMapping(value="/joinForm", method=RequestMethod.GET)
	public String joinForm() {
		
		logger.info("회원 가입 폼 이동");
		
		return "member/joinForm";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(MemberVO member) {
		
		logger.info("회원 가입{}", member);
		
		String page = service.memberJoin(member);
		
		return page;
	}
	@RequestMapping(value="/joinFail", method=RequestMethod.GET)
	public String joinFail() {
	
		return "member/joinFail";
	}
	
	@RequestMapping(value="/joinList", method=RequestMethod.GET)
	public String joinList(Model model, HttpSession session) {
		
		//로그인 처리를 체크(Service에서도 가능)
		String loginId = (String)session.getAttribute("loginId");
		
		//로그인 성공 여부에 따라서 리턴될 값 
		String page = "";
		
		if (loginId != null) {
			ArrayList<MemberVO> list = service.joinList();
			model.addAttribute("memberList", list);
			page = "member/joinList";
		
		}else {
			page = "redirect:/member/loginForm";
		}
		
		return page;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String memberDelete(String member_id) {
		
		int cnt = service.memberDelete(member_id);
		return "redirect:/member/joinList";
	}
	
	@RequestMapping(value="/selectOne", method=RequestMethod.GET)
	public String memberSelectOne(String member_id, Model model) {
		MemberVO member = service.memberSelectOne(member_id);
		
		model.addAttribute("member", member);
		return "member/memberInfo";
	}
	@RequestMapping(value="/memberUpdateForm", method=RequestMethod.GET)
	public String memberUpdateForm(String member_id, Model model) {
		MemberVO member = service.memberSelectOne(member_id);
		
		model.addAttribute("member", member);
		return "member/memberUpdateForm";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String memberUpdate(MemberVO member){
		service.memberUpdate(member);
		return "redirect:/member/joinList";
	}	
	
	@RequestMapping(value="/loginForm", method=RequestMethod.GET) 
	public String memberLoginForm() { 
		
		return "/member/memberLoginForm"; 
	
	}
	 
	
	@RequestMapping(value="/login", method=RequestMethod.POST) 
	public String memberLogin(MemberVO member) {
		
		String page = service.memberLogin(member);
		return page;
	}
	 
	 @RequestMapping(value="/logout", method=RequestMethod.GET) 
	 public String memberLogout() { 
		 
		 service.memberLogout(); 
		 return "redirect:/"; 
		}
	
	
	
}
	