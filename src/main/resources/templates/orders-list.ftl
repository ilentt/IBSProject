<#import "spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset="utf-8">
<script type='text/javascript' src='https://code.jquery.com/jquery-2.1.4.js'></script>

  <script type='text/javascript' src='http://ajax.aspnetcdn.com/ajax/knockout/knockout-3.1.0.js'></script>
  
  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css">

  <!-- Optional theme -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.css">

  <!-- Latest compiled and minified JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script>
<title>Show All Orders</title>
</head>
<body>
<div class="container">
<h2>Orders page</h2>
<a href="/" alt="Home">Back Home</a> 
</div>
<div class="container">
    <table border="1" align="center" style="width:50%">
        <thead>
            <tr>
                <th>Order Id</th>
                <th>Job title</th>
                <th>Quantity</th>
                <th>Order date</th>
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody>
            <#list orders as order>
                <tr>
                    <td>${order.orderID}</td>
                    <td>${order.jobTitle}</td>
                    <td>${order.quantity}</td>
                    
                    <td>${order.orderDate}</td>
                    <td><a href="#">Update</a></td>
                    <td><a href="#">Delete</a></td>
                </tr>
            </#list>
        </tbody>
    </table>
    <p><a href="#">Create Order</a></p>
    </div>
</body>
</html>