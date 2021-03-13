<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*,java.util.*,model.*,dao.*,connection.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String id=request.getParameter("id");
try
{

     String SQL = "delete from Player where Teamid = "+id;
     String SQL1 = "delete from Team where Teamid = "+id;
     String Sql="SET FOREIGN_KEY_CHECKS=0";
     String Sql1="SET FOREIGN_KEY_CHECKS=1";
     Connection c= MyConnection.getConnection();
     
     Statement stmt = c.createStatement();
     stmt.execute(Sql);
     stmt.executeUpdate(SQL1);
     stmt.executeUpdate(SQL);
     stmt.execute(Sql1);
out.println("Data Deleted Successfully!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
</body>
</html>