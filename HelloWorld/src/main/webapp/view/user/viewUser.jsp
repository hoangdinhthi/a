<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ViewUser</title>
</head>
<body>
	<h2>Name: <span><bean:write name="u" property="fullName" /></span> </h2> <br/>
<%-- 	<h2>Age: <span><bean:write name="u" property="age" format="##" /></span></h2> --%>
<%-- 	<h2>Sex: <span><bean:write name="u" property="sex"  /></span></h2> --%>
<%-- 	<h2>About: <span><bean:write name="u" property="about" /></span></h2> --%>
<%-- 	<h2>favourites: <span><bean:write name="u" property="favourites"  /></span></h2> --%>
<%-- 	<h2>job: <span><bean:write name="u" property="job"/></span></h2> --%>

</body>
</html>