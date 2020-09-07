<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX 보충</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

	function sendArray(){

		$.ajax({
			url : "/sendArray",
			type : "post",
			data : {
					arr : [$("input:text").val(),
						   $("input:password").val()
						   ]
				},
			//배열을 보낼때 traditional은 꼭 있어야 한다.
			traditional:true,
			success : function(){alert("통신 성공!");},
			error : function(e){alert("통신 실패...");console.log(e);}
			});
		
		}

	function sendVo(){
		$.ajax({
			url : "/sendVo",
			type : "post",
			/* data : {
				userid:$("input:text").val(),
				userpw:$("input:password").val()
				}, */

			//이름표가 붙어있으면 출력도 할수있다.
			data : $("form").serialize(),
			success:function(){alert("통신 성공!");},
			error:function(e){alert("통신 실패...");console.log(e);}
			});
		}

	function receiveArray(){
		$.ajax({
			url:"/receiveArray",
			type:"post",
			success:function(data){alert("통신 성공!");console.log(data);},
			error:function(e){alert("통신 실패...");console.log(e);}
			});
		}

	function receiveVo(){
		$.ajax({
			url:"/receiveVo",
			type:"post",
			success:function(data){alert("통신 성공!");console.log(data);},
			error:function(e){alert("통신 실패...");console.log(e);}
			});
		}

</script>
</head>
<body>
		<form>
			ID : <input type="text" name="userid"><br>
			비밀번호 : <input type="password" name="userpw">
		</form>	
		<button onclick="sendArray();">컨트롤러로 배열 보내기</button>
		<button onclick="sendVo();">컨트롤러로 VO 보내기</button>
		
		<button onclick="receiveArray();">컨트롤러에서 배열 받기</button>
		<button onclick="receiveVo();">컨트롤러에서 Vo 받기</button>
</body>
</html>