<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
   <%
   
     response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // prevent back button after logout
   
     if(session.getAttribute("username")==null)
     {
    	 response.sendRedirect("login.jsp");
     }
   %>

     welcome ${username} <br>
     
     <a href="videos.jsp">Videos here</a>
     
     <form action="Logout">
       <input type="submit" value="Logout">
     </form>
     
</body>
</html>