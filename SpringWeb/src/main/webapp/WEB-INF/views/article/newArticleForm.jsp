<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>게시글 쓰기</title>
</head>
<body>
	게시글 쓰기 입력 폼:
	<form method="post"><!-- post방식으로보내짐 --><!-- hidden데이터값 전송하려고 쓰임 -->
		<input type="hidden" name="parentId" value="10" /> <!-- name값은 command에서 선언한 변수와 똑같게 -->
		제목: <input type="text" name="title" /><br/> 
		내용: <textarea name="content"></textarea><br/> 
		<input type="submit" />
	</form>
</body>
</html>