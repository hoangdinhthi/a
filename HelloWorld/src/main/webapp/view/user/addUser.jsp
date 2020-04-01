<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>
	<!-- 	<form action="/HelloWorld/view-user.html" method="post"> -->
	<!-- 		<label>Name: </label><input name="name" type="text" /> <br/> -->
	<!-- 		<label>Age: </label><input name="age" type="text"/><br/> -->
	<!-- 		<input value="submit" type="submit"> -->
	<!-- 	</form> -->
	<p style="color: red">
	<html:errors />
	</p>
	<html:form action="/view-user.html" method="post">
		<label><bean:message key="user.name"/></label>
		<html:text name="user" property="name">
		</html:text>
		<html:messages id="name_error" property="user.name.required">
			<p style="color: red">
				<bean:write name="name_error"/>
			</p>
		</html:messages>
		<br />
		<label><bean:message key="user.age"/></label>
		<html:text name="user" property="age">
		</html:text>
		<html:messages id="age_error" property="user.age.invalid">
			<p style="color: red">
				<bean:write name="age_error"/>
			</p>
		</html:messages>
		<br />
		<label><bean:message key="user.sex"/></label>
		<html:radio property="sex" value="Nam" name="user">Nam</html:radio>
		<html:radio property="sex" value="Nu" name="user"> Nu</html:radio>
		<br />
		<label><bean:message key="user.about"/></label>
		<html:textarea property="about" name="user"></html:textarea>
		<br />
		<label><bean:message key="user.favourites"/></label>
		<html:checkbox property="favourites" name="user" value="Xem phim">Xem phim</html:checkbox>
		<html:checkbox property="favourites" name="user" value="nghe nhac">nghe nhac</html:checkbox>
		<br />
		<label><bean:message key="user.job"/></label>
		<html:select property="job" name="user">
			<html:option value="IT">IT</html:option>
			<html:option value="bank Employee">banker</html:option>
			<html:option value="caser">caser</html:option>
		</html:select>
		<html:submit><bean:message key="button.submit"/></html:submit>
	</html:form>
</body>
</html>