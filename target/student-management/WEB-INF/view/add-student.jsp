<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="">

<label>Name:</label>
<form input path="name"/>
<br/>

<label>Mobile:</label>
<form input path="mobile"/>
<br/>

<label>Country:</label>
<form input path="country"/>
<br/>
<input type="submit" value="submit">
</form:form>
</body>
</html>