package student.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import student.vo.Student;

/**
 * DB관련 처리 클래스
 */
public class StudentDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 마이바티스 객체
	
	//학생정보 저장
	public int insert(Student s) {
		
	}

	//전체 읽기
	public ArrayList<Student> selectAll() {
		
	}

	//학생정보 삭제
	public int delete(String id) {
		
	}
	
	//학생정보 수정
	public int update(Student s) {
		
	}
	
	//전체 읽기
	public ArrayList<Student> selectName(String name) {
		
	}

}
