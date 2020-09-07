package com.scit.web9.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.web9.vo.BoardVO;

public interface BoardMapper {
	
	public int boardWrite(BoardVO board);
	public ArrayList<HashMap<String, Object>> boardList(HashMap<String, Object> map);
	public void updateHits(int board_no);
	public HashMap<String, Object> boardRead(int board_no);
	public int boardDelete(int board_no);
	public int boardUpdate(BoardVO board);
//	public ArrayList<HashMap<String, Object>> searchBoard(HashMap<String, Object> map);
}
