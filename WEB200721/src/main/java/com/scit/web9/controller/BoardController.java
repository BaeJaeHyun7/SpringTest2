package com.scit.web9.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scit.web9.service.BoardService;
import com.scit.web9.vo.BoardVO;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@RequestMapping(value="/boardList", method=RequestMethod.GET)
	public String boardList(
			@RequestParam(value = "searchText", defaultValue = "") String searchText, 
			@RequestParam(value = "searchType", defaultValue = "none") String searchType, 
			Model model) {
		
		//글 목록을 조회한 후에 Model에 저장
		ArrayList<HashMap<String, Object>> list = service.boardList(searchText, searchType);
		model.addAttribute("list", list);
		
		return "board/boardList";
	}
	
	@RequestMapping(value="/boardWriteForm", method=RequestMethod.GET)
	public String boardWriteForm() {
		
		return "board/boardWriteForm";
	}
	
	@RequestMapping(value="/boardWrite", method=RequestMethod.POST)
	public String boardWrite(BoardVO board) {
		
		service.boardWrite(board);
		
		return "redirect:/board/boardList";
	}
	
	@RequestMapping(value="/boardRead", method=RequestMethod.GET)
	public String boardRead(int board_no, Model model) {
		
		HashMap<String, Object> map = service.boardRead(board_no);
		model.addAttribute("map", map);
		
		return "board/boardRead";
	}
	
	@RequestMapping(value="/boardDelete", method=RequestMethod.GET)
	public String boardDelete(int board_no) {
		int cnt = service.boardDelete(board_no);
		
		if (cnt == 0) {
			logger.info("삭제 실패 : {}", board_no);
		} else {
			logger.info("삭제 성공 : {}", board_no);
		}
		return "redirect:/board/boardList";
	}
	
	@RequestMapping(value="/boardUpdateForm", method=RequestMethod.GET)
	public String boardUpdateForm(int board_no, Model model) {
		
		HashMap<String, Object> map = service.boardRead(board_no);
		model.addAttribute("map", map);
		
		return "board/boardUpdateForm";
	}
	
	@RequestMapping(value="/boardUpdate", method=RequestMethod.POST)
	public String boardUpdate(BoardVO board) {
		int cnt = service.boardUpdate(board);
		
		if (cnt == 0) {
			logger.info("수정 실패 : {}", board);
		} else {
			logger.info("수정 성공 : {}", board);
		}
		
		return "redirect:/board/boardList";
	}
	
//	@RequestMapping(value="/searchBoard", method=RequestMethod.GET)
//	public String searchBoard(String searchText, String searchType, Model model) {
//		ArrayList<HashMap<String, Object>> list = service.searchBoard(searchText, searchType);
//		model.addAttribute("list", list);
//		
//		return "board/boardList";
//	}
	
}
