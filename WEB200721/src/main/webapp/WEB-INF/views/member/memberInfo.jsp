<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인 회원 정보</title>
<script type="text/javascript">
	function memberUpdateForm(){
		var member_id = document.getElementById("member_id").value;
		location.href = "/member/memberUpdateForm?member_id="+member_id;
	}
</script>
</head>
<body>
	<h1>[ 회원 정보 ]</h1>
	ID : ${member.member_id }<br>
	PW : ${member.member_pw }<br>
	Name : ${member.member_nm }<br>
	등록일 : ${member.member_indate }<br>
	
	<input type="button" value="수정하기" onclick="memberUpdateForm()">
	
	<!-- javascript가 실행 시 member_id의 값을 사용하기 위해 미리 값을 부여(꺼내서 쓰기 위해서) -->
	<input type="hidden" id="member_id" value="${member.member_id }">
</body>
</html>