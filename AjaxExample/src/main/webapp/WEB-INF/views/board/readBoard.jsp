<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${board.title }</title>
<style type="text/css">
	table{
		margin: 0 auto;
	}

</style>
<script type="text/javascript" src="/resources/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		readReply();
	});

	function readReply(){
		$.ajax({
			url: "/board/readReply",
			type: "post",
			data: {
				boardNum: ${board.boardNum}
			},
			success: function(data){
				output(data);
			},
			error: function(e){alert("통신 실패...");console.log(e);}
		});
		
	}

	function output(data){
		var str = "";

		$.each(data, function(index, item){
			str += "<tr>";
			str += "	<td>";
			str += "		" + item.writer ;
			str += "	</td>";
			str += "	<td>";
			str += "		" + item.indate ;
			str += "	</td>";
			str += "	<td>";
			str += "		" + item.content ;
			str += "	</td>";
			str += "</tr>";
		});

		console.log(str);

		$("#replyTable").html(str);
	}
	
</script>
</head>
<body>
	<table border="1">
		<tr>
			<th  colspan="2">${board.title }</th>
		</tr>
		<tr>
			<td>${board.writer }</td>
			<td>${board.indate }</td>
		</tr>
		<tr>
			<td colspan="2">${board.content }</td>
		</tr>
	</table>
	<br>
	<table border="1" id="replyTable">
		
	</table>
	<br>
	<button onclick="location.href='/board/boardList'">게시판으로</button>
	<button onclick="readReply();">댓글 다시 가져오기</button>


</body>
</html>