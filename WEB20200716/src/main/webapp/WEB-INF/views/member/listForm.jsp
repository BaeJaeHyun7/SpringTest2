<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[회원 목록 확인 이동]</title>
</head>
<body>

	<table border="1">
			<tr>
				<th>번호</th>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
				<th>취미</th>		
				<th>성별</th>		
				<th>자기소개</th>		
			</tr>
			<c:forEach var="vo" items="${list }" varStatus="status">
				<tr>
					<td>${status.count }</td>
					<td>${vo.id }</td>
					<td>${vo.pw }</td>
					<td>${vo.name }</td>
					<td>${vo.hobby }</td>			
					<td>${vo.gender }</td>			
					<td>${vo.introduce }</td>			
				</tr>
				
						
			</c:forEach>				
		</table>
		
		<br>
		
		<ul>
		<li>
			<a href="/">메인으로 돌아가기</a>
		</li>
		</ul>

	



	

</body>
</html>