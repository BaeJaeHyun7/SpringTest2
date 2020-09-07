package com.scit.web9.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.web9.controller.MemberController;
import com.scit.web9.service.MemberService;
import com.scit.web9.vo.MemberVo;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm() {
		logger.info("회원가입 폼 이동");
		return "member/joinForm";
		
	}
	
	@RequestMapping(value = "/join",method = RequestMethod.POST)
	public String join(MemberVo member) {
		
		logger.info("회원가입 {}", member);
		
		String page = service.memberJoin(member);
		
		return page;
	}
	
	@RequestMapping(value = "/joinFail", method = RequestMethod.GET)
	public String joinFail() {
		return "member/joinFail";	
	}
	
	@RequestMapping(value = "/listForm", method = RequestMethod.GET)
	public String joinList(Model model) {
		
		ArrayList<MemberVo> list = service.joinList();
		model.addAttribute("list", list);
		logger.info("회원가입 {}", list);
		return "member/listForm";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String memberDelete(String member_id) {
		
		int cnt = service.memberDelete(member_id);
		
		return "redirect:/member/listForm";
		
	}
	
	

}
