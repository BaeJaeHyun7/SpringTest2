<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 회원 가입 폼 ]</title>
<script type="text/javascript">


	function check(){
		var id = document.getElementById('id').value;
		var pw = document.getElementById('pw').value;
		var pwCheck = document.getElementById('pwCheck').value;
		var name = document.getElementById('name').value;
		var hobby = document.getElementsByName('hobby');

		if(id == ""){
			alert("ID는 반드시 입력해야 합니다.");
			return false;
		}else if(id.length < 4 || id.length > 10){
			alert("ID는 4~10글자로 입력해 주세요.");
			return false;
		}

		if(pw == ""){
			alert("비밀번호는 반드시 입력해야 합니다.");
			return false;
		}else if(pw.length < 6 || pw.length > 12){
			alert("비밀번호는 6~12글자로 입력해 주세요.");
			return false;
		}

		if(name == '' || name == 0){

			alert("이름을 입력해 주세요.");
			return false;

			}

		var cnt = 0;
		for (var i = 0; i < hobby.length; i++) {
			if (hobby[i].checked) {
				cnt++;
			}
		}
		if (cnt < 2){
			alert("2개이상을 선택해 주세요.");
			return false;
			}

		
		
		

		return true;


		}





</script>

</head>
<body>
	<form action="/member/join" method="post" onsubmit="return check();">
	
	ID : <input type="text" id="id" name="id"><br>
	PW : <input type="password" id="pw" name="pw"><br>
	PW-Check : <input type="password" id="pwCheck"><br>
	Name : <input type="text" id="name" name="name"><br>
	<label>취미</label>
		축구 : <input type="checkbox" name="hobby" value="축구">
		야구 : <input type="checkbox" name="hobby" value="야구">
		농구 : <input type="checkbox" name="hobby" value="농구">
		족구 : <input type="checkbox" name="hobby" value="족구">
		발야구 : <input type="checkbox" name="hobby" value="발야구"><br>
	<label>성별</label>
		남성 : <input type="radio" name="gender" value="남성">
		여성 : <input type="radio" name="gender" value="여성"><br>
	<label>자기소개</label><br>
		<textarea cols="50" rows="5" name="introduce"></textarea>
	<br>
	<input type="submit" value="회원가입">
		
	
	
	
	</form>




</body>
</html>