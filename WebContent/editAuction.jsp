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
    <title>Auction Form</title>
</head>
<body class="body" style="background-color: lightblue;">
<%
int id=Integer.parseInt(request.getParameter("id"));
AuctionDao ad= new AuctionDao();
AuctionModel am= ad.getAuctionById(id);
%>
    <div class="main">
        <div class="card card-outline-secondary" style="background-color: lightblue;">
            <div class="card-header" style="background-color: royalblue;">
                <h3 class="mb-1">Auction Details</h3>
            </div>
            <div class="card-body">
                <form autocomplete="off" class="form" role="form" action="./updateAuctionServlet" method="post">
                 <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">Auction-Id</label>
                        <div class="col-lg-9">
                            <input class="form-control" type="number" name="Id" value="<%=am.getAuctionid() %>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">Player Id</label>
                        <div class="col-lg-9">
                            <input class="form-control" type="number" name="pid" value="<%=am.getPlayerid() %>">
                        </div>
                    </div>
                       <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">Team Id</label>
                        <div class="col-lg-9">
                            <input class="form-control" type="number"  name="tid" value="<%=am.getTeamid() %>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">Year</label>
                        <div class="col-lg-9">
                            <input class="form-control" type="number"  name="year" value="<%=am.getAuctionYear() %>">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-lg-3 col-form-label form-control-label">Sold For</label>
                        <div class="col-lg-9">
                            <input class="form-control" type="number"  name="amt" value="<%=am.getSoldfor() %>">
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