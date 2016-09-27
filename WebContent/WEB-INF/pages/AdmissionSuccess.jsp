<!DOCTYPE html>
<html lang="en">
 <%@ page contentType="text/html;charset=UTF-8" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h3>Submitted Details</h3>
  <h3>${headerMsg}</h3>            
  <table class="table">
   
    <tbody>
      <tr>
        <td> <spring:message code="label.studentName"/></td>
        <td>${stuObj.studentName}</td>
      </tr>
      <tr>
        <td> <spring:message code="label.studentHobbie" /></td>
        <td>${stuObj.studentHobbie}</td>
      </tr>
      
       <tr>
        <td> <spring:message code="label.studentMobile" /></td>
        <td>${stuObj.studentMobile}</td>
      </tr>
      
       <tr>
        <td> <spring:message code="label.studentDOB" /></td>
        <td>${stuObj.studentDOB}</td>
      </tr>
      
       <tr>
        <td><spring:message code="label.studentSkills" /></td>
        <td>${stuObj.studentSkills}</td>
      </tr>
      
      
       <tr>
        <td>    <spring:message code="label.country" /></td>
        <td>${stuObj.studentAddress.country}</td>
      </tr>
      
       <tr>
        <td>    <spring:message code="label.city" /></td>
        <td>${stuObj.studentAddress.city}</td>
      </tr>
      
       <tr>
        <td><spring:message code="label.street" /></td>
        <td>${stuObj.studentAddress.street}</td>
      </tr>
      
       <tr>
        <td><spring:message code="label.pincode" /></td>
        <td>${stuObj.studentAddress.pincode}</td>
      </tr>
      
      
     
    </tbody>
  </table>
</div>

</body>
</html>
