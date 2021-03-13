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
AuctionDao ad= new AuctionDao();
List<AuctionModel> li= ad.viewAllAuction();
%>
<table>
<tr>
<th>ID</th>
<th>Player ID</th>
<th>Team ID</th>
<th>Year</th>
<th>soldfor</th>
<th>Action</th>
</tr>
<%
for(AuctionModel a:li){
%>
<tr>
<td><%=a.getAuctionid()%></td>
<td><%=a.getPlayerid() %></td>
<td><%=a.getTeamid() %></td>
<td><%=a.getAuctionYear()%></td>
<td><%=a.getSoldfor() %></td>
<td><a href="editAuction.jsp?id=<%=a.getAuctionid()%>"><button>Update</button></a>
<a href="deleteAuct.jsp?id=<%=a.getAuctionid() %>"><button class="delete">Delete</button></a></td>
</tr>
<%} %>
</table>
</body>
</html>