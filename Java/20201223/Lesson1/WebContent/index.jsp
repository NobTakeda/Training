<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%-- pageディレクティブ--%>
<%@ page import="java.util.Date,java.text.SimpleDateFormat" %>
<%
//スクリプトレットの中でのコメントは従来通りで良い。
String[] luckArray={"超スッキリ","スッキリ","最悪"};
int index=(int)(Math.random()*3);
String luck=luckArray[index];

Date date=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("MM月dd日");
String today=sdf.format(date);
%>
<!DOCTYPE html>
<html>
<head>
<%-- 文字コード指定 --%>
<!-- このコメントはコンパイル後に外から閲覧できてしまう -->
<meta charset="UTF-8">
<title>スッキリ占い</title>
</head>
<body>
<p><%= today %>の運勢は「<%= luck %>」です</p>
</body>
</html>