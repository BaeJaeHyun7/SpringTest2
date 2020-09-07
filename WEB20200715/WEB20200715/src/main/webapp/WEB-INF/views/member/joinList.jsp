<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>
	<h1>[ 회원 목록 화면 ]</h1>
	
	<c:choose>
		<c:when test="${not empty list }">
			<table>
				<tr>
					<th>번호</th>
					<th>아이디</th>
					<th>이름</th>
					<th>삭제</th>
				</tr>
				<c:forEach items="${list }" var="vo" varStatus="status">
					<tr>
						<td>${status.count }</td>
						<td>${vo.user_id }</td>
						<td>${vo.user_nm }</td>
						<td>
							<a href="/member/delete?user_id=${vo.user_id }">삭제</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			등록된 회원이 없습니다.
		</c:otherwise>
	</c:choose>
	
	<a href="/">메인으로</a>
	
</body>
</html>