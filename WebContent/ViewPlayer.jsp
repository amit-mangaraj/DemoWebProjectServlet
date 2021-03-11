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
PlayerDao pd= new PlayerDao();
List<PlayerModel> li= pd.viewAll();
%>
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Skills</th>
<th>DOB</th>
<th>Runs</th>
<th>Wickets</th>
<th>Matches Played</th>
<th>Country</th>
</tr>
<%
for(PlayerModel p:li){
%>
<tr>
<td><%=p.getPlayer_id() %></td>
<td><%=p.getPname() %></td>
<td><%=p.getSkills() %></td>
<td><%=p.getDateofBirth() %></td>
<td><%=p.getRuns() %></td>
<td><%=p.getWickets() %></td>
<td><%=p.getNoOfMatches() %></td>
<td><%=p.getNationality() %></td>
<td><a href="editplayer.jsp?id=<%=p.getPlayer_id()%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>