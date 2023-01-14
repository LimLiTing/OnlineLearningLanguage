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
<form name=ChooseLanguageform method="post" action="KrnPrivateTutor">
<h1>Choose Personal Tutorial For Korean Class</h1>
<br>
Mrs. Zhou <input type="radio" value="Mrs. Zhou" name="ClassTutor"/><br><br>
Miss Wu <input type="radio" value="Miss Wu" name="ClassTutor"/><br><br>
Mrs. Arya <input type="radio" value="Mrs. Arya" name="ClassTutor"/><br><br>
Mr. Jai <input type="radio" value="Mr. Jai" name="ClassTutor"/><br><br>
Miss Jessie <input type="radio" value="Miss Jessie" name="ClassTutor"/><br><br>
<input type="submit" value="Submit"/>
<input type="button" value="Return" onclick="history.back()"/>
</form>
</body>
</html>