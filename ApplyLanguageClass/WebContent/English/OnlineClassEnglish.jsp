<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
form
{
border: 5px solid;
background-color: #a2b9bc;
padding: 50px;
margin: 100px; 
width: 500px;
height: 600px;
}
h1
{
color: white; 
text-align: center;
}
body
{
background-image: url("img/Background.jpg");
}
</style>
</head>
<body>
<form name=ChooseLanguageform method="post" action="EngOnlineClass">
<h1>Choose Online Class Section For English Class</h1>
<br>
Section 1 <input type="radio" name="sec" value="engSec1"/><br><br>
Section 2 <input type="radio" name="sec" value="engSec2"/><br><br>
Section 3 <input type="radio" name="sec" value="engSec3"/><br><br>
Section 4 <input type="radio" name="sec" value="engSec4"/><br><br>
Section 5 <input type="radio" name="sec" value="engSec5"/><br><br>
<input type="submit" value="Submit"/>
<input type="button" value="Return" onclick="history.back()"/>
</form>
</body>
</html>