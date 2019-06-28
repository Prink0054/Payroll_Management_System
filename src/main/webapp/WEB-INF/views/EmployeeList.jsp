<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
 <h1 style="color: maroon;">Payroll Management System </h1> 
    <font color="Green" size="4">[Login as Adminisrator]</font>
    
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
    
    <font style="color: red;" face="Bold">Employees:</font> <a href="/PayRoll/getSaveEmployee">New Employee</a>
    <table border="1">
    <tr style="background: aqua;">
    <th>Employee Id</th>
    <th>Name</th>
    <th>Contact</th>
    <th>Email</th>
    <th>User Type</th>
    <th>Password</th>
    <th>X</th>
    </tr>
	<c:forEach items="${allemp}" var="empList">
    <tr style="background: lightyellow" align="center">
    <td><c:out value="${empList.employeeid}"/></td>
    <td><c:out value="${empList.name}"/></td>
    <td><c:out value="${empList.contact_number}"/></td>
    <td><c:out value="${empList.email}"/></td>
    <td><c:out value="${empList.user_type}"/></td>
    <td><c:out value="${empList.password}"/></td>
    <td><a href="">Delete</td>
    </tr>    
    </c:forEach>
    </table>
</body>
</html>