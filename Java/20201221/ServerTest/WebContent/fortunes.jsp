<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<%
	Random rand=new Random();
	int fortune=rand.nextInt(4);
	String[] strs={"大吉","中吉","吉","凶"};
	String str=strs[fortune];
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/main.css">
<title>Insert title here</title>
</head>
<body>
	<%switch(fortune){
	case 0:
		out.print("<p class='great'> strs[0] </p>");
		break;
	case 1:
		out.print("<p class='great'> strs[1] </p>");
		break;
	case 2:
		out.print("<p class='great'> strs[2] </p>");
		break;
	case 3:
		out.print("<p class='great'> strs[3] </p>");
		break;
	} %>
</body>
</html>