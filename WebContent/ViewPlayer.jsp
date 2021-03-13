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
 tr td a .delete:hover{
background-color: red;
}
th, td {
  padding: 15px;
}
</style>
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
<th>Action</th>
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
<td><a href="editplayer.jsp?id=<%=p.getPlayer_id()%>"><button>Update</button></a>
<a href="delete.jsp?id=<%=p.getPlayer_id() %>"><button class="delete">Delete</button></a></td>
</tr>
<%} %>
</table>
</body>
</html>