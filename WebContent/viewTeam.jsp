<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import ="java.util.*,model.*,dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
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
</tr>
<%
for(TeamModel t:tm){
%>
<tr>
<td><%=t.getTeam_id() %></td>
<td><%=t.getTeamname() %></td>
<td><%=t.getOwnername() %></td>
<td><a href="editTeam.jsp?id=<%=t.getTeam_id()%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>