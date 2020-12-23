<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
<%
Monster[] monsters={new Slime("スラきち"),new DeathBat("ゴメス"),new Slime("スラッち")};
/* Slime s1=new Slime("スラきち");
DeathBat d1=new DeathBat("ゴメス");
Slime s2=new Slime("スラッち");
monsters[0]=s1;
monsters[1]=d1;
monsters[2]=s2; */
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>モンスターが逃げる練習問題</title>
</head>
<body>
<% for(Monster m:monsters){%>
	<p><%= m.run() %></p>
<%} %>
</body>
</html>