package com.scit.web9.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web9.dao.BoardDAO;
import com.scit.web9.dao.BoardMapper;
import com.scit.web9.vo.BoardVO;

@Service
public class BoardService {

		@Autowired
		private BoardDAO dao;
		
		@Autowired
		private HttpSession session;
		
		public int boardWrite(BoardVO board) {
			
		//member_id 를 추가 
		//: 최종적으로 마지막에 실행되는 쿼리문에 member_id가 전달이 돼야 실행되기 때문
		String member_id = (String)session.getAttribute("loginId");
		board.setMember_id(member_id);
		
		
		int cnt = dao.boardWrite(board);
		return cnt;
	}
		
		public ArrayList<HashMap<String, Object>> boardList(String searchText, String searchType){
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("searchText", searchText);
			map.put("searchType", searchType);
			
			ArrayList<HashMap<String, Object>> list = dao.boardList(map);
			
			return list;
		}
		
		public HashMap<String, Object> boardRead(int board_no){	
			//조회 수를 증가
			dao.updateHits(board_no);
			//해당 글을 조회
			HashMap<String, Object> map = dao.boardRead(board_no);
		
			return map;
		}
		
		public int boardDelete (int board_no) {
			int cnt = dao.boardDelete(board_no);
			return cnt;
		}
		
		public int boardUpdate(BoardVO board) {
			String member_id = (String)session.getAttribute("loginId");
			board.setMember_id(member_id);
			
			int cnt = dao.boardUpdate(board);
			return cnt;
		}
		
//		public ArrayList<HashMap<String, Object>> searchBoard(String searchText, String searchType) {
//			HashMap<String, Object> map = new HashMap<String, Object>();
//			map.put("searchText", searchText);
//			map.put("searchType", searchType);
//			
//			ArrayList<HashMap<String, Object>> list = dao.searchBoard(map);
//			
//			return list;
//		}
}
		
