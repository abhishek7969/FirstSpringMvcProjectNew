<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     --%>
    <%@ page contentType="text/html;charset=UTF-8" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="/FirstSpringMvcProjectNew/admissionForm.html?siteLanguage=en">English</a> |
<a href="/FirstSpringMvcProjectNew/admissionForm.html?siteLanguage=hindi">Hindi</a>
	
	  <form:errors path="stuObj.*" />
	<!-- Special version of Bootstrap that only affects content wrapped in .bootstrap-iso -->
<link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" /> 

<!-- Inline CSS based on choices in "Settings" tab -->
<style>.bootstrap-iso .formden_header h2, .bootstrap-iso .formden_header p, .bootstrap-iso form{font-family: Arial, Helvetica, sans-serif; color: black}.bootstrap-iso form button, .bootstrap-iso form button:hover{color: white !important;} .asteriskField{color: red;}</style>
  <h2>${headerMsg}</h2>
<!-- HTML Form (wrapped in a .bootstrap-iso div) -->
<div class="bootstrap-iso">
 <div class="container-fluid">
  <div class="row">
   <div class="col-md-2 col-sm-2 col-xs-8">
   
  
  
    <form class="form-horizontal" action="/FirstSpringMvcProjectNew/submitAdmissionForm.html" method=POST>
     <div class="form-group ">
      <label class="control-label " for="name">
       <spring:message code="label.studentName"/>
      </label>
      <input class="form-control" name="studentName" type="text"/>
     </div>
     <div class="form-group ">
      <label class="control-label " for="subject">
           <spring:message code="label.studentHobbie" />
      </label>
      <input class="form-control" name="studentHobbie" type="text"/>
     </div>
     
     <div class="form-group ">
      <label class="control-label " for="subject">
           <spring:message code="label.studentMobile" />
      </label>
      <input class="form-control" name="studentMobile" type="text"/>
     </div>
     
     <div class="form-group ">
      <label class="control-label " for="subject">
           <spring:message code="label.studentDOB" />
      </label>
      <input class="form-control" name="studentDOB" type="text"/>
     </div>
     
      <div class="form-group ">
    <tr>
      
     <td><spring:message code="label.studentSkills" /></td>
     <td>
     <select name ="studentSkills" multiple>
     	<option value="Java Core">Java Core </option>
     	 <option value="Spring core">Spring Core </option>     
     </select>
  
    </tr>    
     </div>
     
     <div class="form-group ">
      <label class="control-label " for="subject">
      <spring:message code="label.country" />
      </label>
      <input class="form-control" name="studentAddress.country" type="text"/>
      
      <label class="control-label " for="subject">
      <spring:message code="label.city" />
      </label>
      <input class="form-control" name="studentAddress.city" type="text"/>
      
      <label class="control-label " for="subject">
      <spring:message code="label.street" />
      </label>
      <input class="form-control" name="studentAddress.street" type="text"/>
      
      <label class="control-label " for="subject">
      <spring:message code="label.pincode" />
      </label>
      <input class="form-control" name="studentAddress.pincode" type="text"/>
     </div>
     
     
     <div class="form-group">
      <div>
       <button class="btn btn-primary btn-sm" name="submit" type="submit">
        Submit
       </button>
      </div>
     </div>
    </form>
   </div>
  </div>
 </div>
</div>
	


</body>
</html>