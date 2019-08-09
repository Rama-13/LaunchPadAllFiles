<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><%
String username = request.getParameter("username");
String password = request.getParameter("password");
session.setAttribute("username",username);
if(username.equals("rama")&&password.equals("rama"))
{
	
%>
<jsp:forward page="success.jsp"></jsp:forward>
<%
}
else
{
	
session.setAttribute("errMsg", "Incorrect Username or password");
response.sendRedirect("index.jsp");
}


%>

}



%>

</body>
</html>