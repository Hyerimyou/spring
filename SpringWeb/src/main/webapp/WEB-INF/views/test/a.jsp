<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>에이</title>
</head>
<body>
	<h2>A입니다</h2>
	<form method="post">
		이름 : <input name="name"><br>
		언어 : 
		<input type="checkbox" name="lang" value="java">java
		<input type="checkbox" name="lang" value="html">html
		<input type="checkbox" name="lang" value="sql">sql
		<input type="checkbox" name="lang" value="python">python
		<br>
		<input type="submit" value="전송"><!-- submit꼭쓰기 -->
	</form>
</body>
</html>