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
PlayerDao pd=new PlayerDao();
List<PlayerModel> li=pd.viewAll();
List<PlayerModel> nli=new ArrayList<PlayerModel>();
String name=request.getParameter("tname");
for(PlayerModel p: li){
	if(p.getNationality().equalsIgnoreCase(name)){
		nli.add(p);
	}
}
%>
<h1>Team Name: <%=name %> </h1>
<h2>Players are</h2>
<% for(PlayerModel p2:nli) {%>
<%=p2.getPname()%> <br><br>
<%} %>
</body>
</html>