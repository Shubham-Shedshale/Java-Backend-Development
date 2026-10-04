<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="leaveapp" method="post">
<h1>Employee Leave Application</h1>
<label>ID :</label>
<input type="text" name="id" value="${id}" readonly="readonly"><br>
<label>Name :</label>
<input type="text" name="name"><br>
<label>Leave Type :</label>
<input type="text" name="type"><br>
<label>Start Date :</label>
<input type="text" name="sdate"><br>
<label>End Date :</label>
<input type="text" name="edate"><br>
<label>Reason :</label>
<input type="text" name="reason"><br>

<button type="submit">Submit</button>


</form>
</body>
</html>