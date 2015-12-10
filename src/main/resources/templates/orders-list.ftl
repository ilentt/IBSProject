<#import "spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset="utf-8">
<title>Show All Orders</title>
</head>
<body>
<div>
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