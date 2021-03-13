<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import ="java.util.*,model.*,dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table, td, th {  
  border: 1px solid #ddd;
  text-align: left;
}

table {
  border-collapse: collapse;
  width: 100%;
}
tr:hover {background-color: lightblue;}
tr th{background-color: orange;}
tr td a button:hover{background-color: lightgreen;}
th, td {
  padding: 15px;
}
 tr td a .delete:hover{
background-color: red;
}
</style>
<body>
<%
TeamDao td= new TeamDao();
List<TeamModel> tm= td.viewAllTeam();
%>
<table>
<tr>
<th>ID</th>
<th>Team Name</th>
<th>Owner Name</th> 
<th>Action</th>
</tr>
<%
for(TeamModel t:tm){
%>
<tr>
<td><%=t.getTeam_id() %></td>
<td><%=t.getTeamname() %></td>
<td><%=t.getOwnername() %></td>
<td><a href="editTeam.jsp?id=<%=t.getTeam_id()%>"><button>Update</button></a>
<a href="deleteTeam.jsp?id=<%=t.getTeam_id() %>"><button class="delete">Delete</button></a></td>
</tr>
<%} %>
</table>
</body>
</html>