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
height: 1100px;
}
h1
{
color: white; 
text-align: center;
}
p
{
color: #F0F8FF;
text-align: right;
display: flex;
}
body
{
background-image: url("img/Background.jpg");
}
</style>
</head>
<body>
<form name=ChooseLanguageform method="post" action="Controller">
<h1>Please choose the Language</h1>
<p>
<img alt="English Icon" src="img/English Icon.png" width="100" height="100"><br>
Learn to write, read and speak English language fluently for about 5 Month.</p><br>
English <input type="radio" value="English" name="language"/><br><br>
<p>
<img alt="Malay Icon" src="img/Malay Icon.png" width="100" height="100"><br>
Learn to write, read and speak Malay language fluently for about 5 Month.</p><br>
Malay <input type="radio" value="Malay" name="language"/><br><br>
<p>
<img alt="Chinese Icon" src="img/Chinese Icon.png" width="100" height="100"><br>
Learn to write, read and speak Chinese language fluently for about 5 Month.</p><br>
Chinese <input type="radio" value="Chinese" name="language"/><br><br>
<p>
<img alt="Japanese Icon" src="img/Japanese Icon.png" width="100" height="100"><br>
Learn to write, read and speak Japanese language fluently for about 5 Month.</p><br>
Japanese <input type="radio" value="Japanese" name="language"/><br><br>
<p>
<img alt="Korean Icon" src="img/Korean Icon.png" width="100" height="100"><br>
Learn to write, read and speak Korean language fluently for about 5 Month.</p><br>
Korean <input type="radio" value="Korean" name="language"/><br><br>
<input type="submit" value="Submit"/>
<input type="button" value="Return" onclick="history.back()"/>
</form>
</body>
</html>