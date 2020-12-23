<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int sum=0;
	for(int i=1000;i<=3000;i++){
		sum+=i;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>合計は<%= sum %>です。</p>
</body>
</html>