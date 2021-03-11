<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import ="java.util.*,model.*,dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="playerform.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body class="body" style="background-color: lightblue;">
<%
int id=Integer.parseInt(request.getParameter("id"));
PlayerDao pd= new PlayerDao();
PlayerModel pm= pd.getPlayerById(id);
%>
    <div class="main">
        <div class="card card-outline-secondary" style="background-color: lightblue;">
            <div class="card-header" style="background-color: royalblue;">
                <h3 class="mb-1">Player Details</h3>
            </div>
            <div class="card-body">
                <form  class="form" role="form" action="./UpdatePlayerServlet" method="post">
                 <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">Player-Id</label>
                        <div class="col-lg-9">
                            <input class="form-control" type="number" name="Id" value="<%=pm.getPlayer_id() %>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">First name</label>
                        <div class="col-lg-9">
                            <input class="form-control" type="text" name="name" value="<%=pm.getPname() %>">
                        </div>
                    </div>
                       <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">Skills</label>
                        <div class="col-lg-9">
                            <input class="form-control" type="text"  name="skill" value="<%=pm.getSkills()%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">Date of Birth</label>
                        <div class="col-lg-9">
                            <input class="form-control" type="text"  name="dob" value="<%=pm.getDateofBirth()%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">Runs</label>
                        <div class="col-lg-9">
                            <input class="form-control" type="number" name="runs"value="<%=pm.getRuns() %>">
                        </div>
                    </div>
                     <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">Wickets</label>
                        <div class="col-lg-9">
                            <input class="form-control" type="number" name="wickets" value="<%=pm.getWickets() %>">
                        </div>
                    </div>
                       <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">No of Matches</label>
                        <div class="col-lg-9">
                            <input class="form-control" type="number" name="matches" value="<%=pm.getNoOfMatches()%>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">Country</label>
                        <div class="col-lg-9">
                            <!-- <input class="form-control" type="number" value="Bishop"> -->
                            <div class="input-group mb-3">
                                <select class="custom-select" id="iscountry" name="iscountry" value="<%=pm.getNationality()%>">
                                  <option selected>India</option>
                                  <option value="1">England</option>
                                  <option value="2">Australia</option>
                                  <option value="3">New Zealand</option>
                                </select>
                              </div>
                        </div>
                    </div>
          <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">Team Id</label>
                        <div class="col-lg-9">
                            <input class="form-control" type="number" name="Teamid" value="<%=pm.getTeamid() %>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label"></label>
                        <div class="col-lg-9">
                            <input class="btn btn-secondary" type="reset" value="Cancel">
                            <input class="btn btn-primary" type="submit" value="Save Changes">
                        </div>
                    </div>   
                </form>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>