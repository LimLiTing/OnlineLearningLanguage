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
<form name=ChooseLanguageform method="post" action="JpnPrivateTutor">
<h1>Choose Personal Tutorial For Japanese Class</h1>
<br>
Mr. Amin <input type="radio" value="Mr. Amin" name="ClassTutor"/><br><br>
Mr. Alex <input type="radio" value="Mr. Alex" name="ClassTutor"/><br><br>
Mrs. Noor <input type="radio" value="Mrs. Noor" name="ClassTutor"/><br><br>
Mr. Chen<input type="radio" value="Mr. Chen" name="ClassTutor"/><br><br>
Miss Huang <input type="radio" value="Miss Huang" name="ClassTutor"/><br><br>
<input type="submit" value="Submit"/>
<input type="button" value="Return" onclick="history.back()"/>
</form>
</body>
</html>