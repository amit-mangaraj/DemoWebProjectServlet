<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <%@ page import ="java.util.*,model.*,dao.*" %>
  <%
  PlayerDao pd=new PlayerDao();
  Set<String> teamName = new TreeSet<String>();
  List<PlayerModel> l=pd.viewAll();
  for(PlayerModel p:l){ 
	  teamName.add(p.getNationality());
  }
  
  %>
  <%
for(String str:teamName){
	 %>
	 <a href="viewTeamPlayers.jsp?tname=<%=str%>"><%=str%></a> <br><br>
	 <%} %>

</body>
</html>