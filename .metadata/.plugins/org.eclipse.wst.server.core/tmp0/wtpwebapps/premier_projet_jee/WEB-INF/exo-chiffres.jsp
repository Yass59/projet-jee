<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link 

	rel="stylesheet" 

	href="css/exo-chiffres.css"/>



</head>

<body>

<h1>EXO</h1>

<div> mohamed meilleur developpeur jee</div>
<%

for(int i =1 ; i <= 10 ; i++){

	out.print

	("<img src='https://img-19.ccm2.net/WA-cJN4p7hECHq8h5_MUthRKFH4=/f60227320e7a48a8b0a6d80511934148/ccm-faq/38925-U7y54U3xG1TORMVw-s-.png'/>");

}

%>
<table>

<tr>

<%

int nombre = 

	(Integer) request.getAttribute("nombre");

int mod = 

	(Integer) request.getAttribute("mod");



for(int i = 1 ; i <= nombre; i++ ){

	out.print("<td>" + i + "</td>");

	if(i % mod == 0){

		out.print("</tr><tr>");

	}

}

%>

</tr>
</table>
<button>Clique sur moi !</button>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script type="text/javascript" src ="js/exo-chiffres.js"></script>
</body>
</html>