package com.scit.web9.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.web9.vo.MemberVo;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSession session;
	
	public int memberJoin(MemberVo member) {
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt = 0;
		
		try {
			
			cnt = mapper.memberJoin(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt;	
	}
	
	public ArrayList<MemberVo> joinList(){
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		ArrayList<MemberVo> list = null;
		
		try {
			list = mapper.joinList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int memberDelete(String member_id) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt = 0;
		
		try {
			cnt = mapper.memberDelete(member_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	
	
	
	
	

}
