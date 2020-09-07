<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>

<h1>[회원 목록]</h1>

<table>
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>생년월일</th>
			<th>등록일자</th>
			<th>삭제</th>
		</tr>
		<c:forEach items="${list }" var="member" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${member.member_id }</td>
				<td>${member.member_nm }</td>
				<td>${member.member_birth }</td>
				<td>${member.member_indate }</td>				
				<td>
					<a href="/member/delete?member_id=${member.member_id }">회원삭제</a>
				</td>				
			</tr>
		</c:forEach>
		

	</table>
	
	<a href="/">메인으로</a>

</body>
</html>