<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>게시글 쓰기</title>
</head>
<body>
	게시글 등록됨:
	<br> title: ${ command.title }<!-- 모델어트리뷰트에서 설정했던값으로 -->
	<br> content : ${ command.content }
</body>
</html>
