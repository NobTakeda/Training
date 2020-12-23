<%@ page contentType="text/html; charset=utf-8"
import="ex.Employee" %>
<% Employee emp=new Employee("0001","湊祐介"); %>

<!DOCTYPE html>
<html>
<body>
<%for(int i=0;i<10;i++){ %>
	<%if(i%3==0){ %>
<p style="color:red">IDは<%=emp.getId() %>、名前は<%=emp.getName() %>です</p>
	<%}else{ %>
<p>IDは<%=emp.getId() %>、名前は<%=emp.getName() %>です</p>
	<%} %>
<%} %>
</body>
</html>