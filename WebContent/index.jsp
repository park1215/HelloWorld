<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is the first page</title>
</head>
<body>
Hello World!
<form action="./userJoinAction.jsp" method="post">
	<input type="text" name="userId">
	<input type="password" name="userPassword">
	<input type="submit" value="member_join">
</form>
</body>
</html>