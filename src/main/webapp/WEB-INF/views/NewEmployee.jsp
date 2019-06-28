<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New</title>
</head>
<body>
<h1 style="color: maroon;">Payroll Management System </h1> 
    
    
    <table>
    <tr>
    <td><a href="/PayRoll/adminHome">Home</a>
    </td>
    <td><a href="/PayRoll/addEmployee">Employee</td>
    <td><a href="/PayRoll/logout">logout</td>
    </tr>
    <tr>
    </tr>
    </table>
   <font style="color: red;" face="Bold" size="3">New Employee:</font> 
    
    <form action="/PayRoll/saveEmployee" method="post" >
    <table>
   
    
      <tr>
    	<td>Name</td>
    	<td><input type="text" name ="name"></td>
    </tr>
    	
    	<tr>
    	<td>Contact Number</td>
    	<td><input type="text" name ="contact_number"></td>
    </tr>
    <tr>     
    	<td>User Type</td>
    	<td> 
    	<select name="user_type">
    	<option value="None">none</option>
  		<option value="Manager">Manager</option>
  		<option value="Employee">Employee</option>
		</select>
		</td>
    	</tr>
    
    <tr>
    	<td>Email</td>
    	<td><input type="text" name ="email"></td>
    </tr>
    
    
    <tr>
    	<td>Password</td>
    	<td><input type="text" name ="password"></td>
    </tr>
    
    <tr>
    <td><input type="submit" value="Save"></td>
    </tr>
     
    
    </table>
    
    

</body>
</html>