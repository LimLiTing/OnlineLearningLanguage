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
p
{
color: #F0F8FF; 
display: flex;
}
body
{
background-image: url("img/Background.jpg");
}
</style>
</head>
<body>
<form name=ChooseLanguageform method="post" action="MalayChoose">
<h1>Choose Malay Class Learning Method</h1>
<br>
<p>
<img alt="Online Class Icon" src="img/Online Class Icon.png" width="100" height="100"><br><br>
Learn Malay language online anytime, anywhere.</p><br><br>
Online Class <input type="radio" value="online class" name="choice"/>
<br><br><br><br>
<p>
<img alt="Personal Tutor Icon" src="img/Personal Tutor Icon.png" width="100" height="100"><br><br>
Learn Malay language face-to-face with our best tutors.</p><br><br>
Personal Tutor <input type="radio" value="personal tutor" name="choice"/>
<br><br>
<input type="submit" value="Submit"/>
<input type="button" value="Return" onclick="history.back()"/>
</form>
</body>
</html>