<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String str="Hello World";
int[] data={1,2,3};
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Hello JSP</p>
<p><%=str+3+7 +data[1] %></p>
</body>
</html>