<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%for(int i=0;i<10;i++){%>
<p>Hello</p>
<%} %>
<%int i=new Random().nextInt(3)+1;
System.out.print(i);
out.println(i);%>
<%if(i==1) {%>
	<a>iは1です</a>
<%} else if(i==2){%>
	<a>iは2です</a>
<%}else{ %>
	<a>iは<%=i %>です</a>
<%} %>
</body>
</html>