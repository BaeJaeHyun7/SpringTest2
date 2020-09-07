<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 목록 페이지</h1>
	
	<table>
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>등록일자</th>
			<th></th>
		</tr>
		
		<c:forEach items="${memberList}" var="member" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${member.member_id }</td>
				<td>
					<a href="/member/selectOne?member_id=${member.member_id }">${member.member_nm }</a>
				</td>
				<td>${member.member_indate }</td>
				<td>
					<!-- 1.jsp에서 삭제를 클릭(해당하는 회원의 pk 값을 전달) 
					2.삭제 요청이 컨트롤러에 전달
					3.DB에서 해당하는 회원 정보 삭제  4.처리가 된 이후의 회원 목록 화면으로 돌아온다
					*'요청주소?변수명=지정할 데이터(값)&변수명=지정할 데이터(값)...' 
					요청과 데이터를 동시에 보내는 것을 '쿼리 스트링'-->
					<a href="/member/delete?member_id=${member.member_id }">삭제</a>
				</td>
			</tr>
		</c:forEach>
	
	</table>
	
</body>
</html>