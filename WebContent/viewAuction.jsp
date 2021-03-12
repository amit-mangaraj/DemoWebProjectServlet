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
<td><a href="editAuction.jsp?id=<%=a.getAuctionid()%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>