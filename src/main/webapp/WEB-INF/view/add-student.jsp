<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 0;
    }
    .container {
        max-width: 400px;
        margin: 50px auto;
        padding: 20px;
        background-color: #fff;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    h3 {
        text-align: center;
        color: #333;
    }
    label {
        display: block;
        margin-bottom: 5px;
    }
    input[type="text"] {
        width: calc(100% - 22px);
        padding: 5px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #4CAF50;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.3s;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
    <div class="container">
        <h3>Add Student</h3>
        <form:form action="save-student" modelAttribute="student" method="POST">
            <form:hidden path="id"/>

            <label for="name">Name:</label>
            <form:input path="name" id="name"/>
            <br />

            <label for="mobile">Mobile:</label>
            <form:input path="mobile" id="mobile"/>
            <br />

            <label for="country">Country:</label>
            <form:input path="country" id="country"/>
            <br />

            <input type="submit" value="Submit">
        </form:form>
    </div>
</body>
</html>
