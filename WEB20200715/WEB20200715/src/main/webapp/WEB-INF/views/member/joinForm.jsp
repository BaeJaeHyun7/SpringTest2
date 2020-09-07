<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼</title>
<script type="text/javascript">
	function formCheck(){
		var user_id = document.getElementById("user_id").value;
		var user_pw = document.getElementById("user_pw").value;
		var user_pw_check = document.getElementById("user_pw_check").value;
		var user_nm = document.getElementById("user_nm").value;
		var gender_check = document.getElementsByName("gender_check");

		if(user_id == '' || user_id.length == 0){
			alert("아이디를 입력해 주세요.");
			return false;
		}

		if(user_pw == '' || user_pw.length == 0){
			alert("비밀번호를 입력해 주세요.");
			return false;
		}

		if(user_pw != user_pw_check){
			alert("동일한 비밀번호를 입력해 주세요");
			return false;
		}

		if(user_nm == '' || user_nm.length == 0){
			alert("이름를 입력해 주세요.");
			return false;
		}


		for(var i=0; i<gender_check.length; i++){
			if(gender_check[i].checked == true){
				document.getElementById("user_gender").value = gender_check[i].value;
				break;
			}
		}
		
		return true;
	}
</script>
</head>
<body>
	<h1>[ 회원 가입 폼 ]</h1>

	<form action="/member/join" method="post" onsubmit="return formCheck();">
		ID : <input type="text" name="user_id" id="user_id"> <br>
		PW : <input type="password" name="user_pw" id="user_pw"> <br>
		PW-Check : <input type="password" id="user_pw_check"> <br>
		Name : <input type="text" name="user_nm" id="user_nm"> <br>
		Hobby <br>
		취미1 <input type="checkbox" name="user_hobby" value="h1">
		취미2 <input type="checkbox" name="user_hobby" value="h2">
		취미3 <input type="checkbox" name="user_hobby" value="h3">
		취미4 <input type="checkbox" name="user_hobby" value="h4">
		취미5 <input type="checkbox" name="user_hobby" value="h5">
		<br>
		Gender <br>
		남 : <input type="radio" name="gender_check" value="m" checked="checked">
		여 : <input type="radio" name="gender_check" value="f">
		<input type="hidden" name="user_gender" id="user_gender">
		<input type="submit" value="회원가입">
	</form>
	
</body>
</html>