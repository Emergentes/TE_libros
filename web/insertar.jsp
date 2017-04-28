<%@page import="com.emergentes.Libro"%>
<%
String isbn = request.getParameter("isbn");
String titulo = request.getParameter("titulo");
String categoria = request.getParameter("categoria");

Libro libro = new Libro(isbn, titulo, categoria);

libro.insertar();

response.sendRedirect("index.jsp");
%>
