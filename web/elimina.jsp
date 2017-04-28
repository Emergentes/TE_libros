<%@page import="com.emergentes.Libro"%>
<%
    String isbn = request.getParameter("id");
    Libro libro = new Libro();
    libro.Eliminar(isbn);
    response.sendRedirect("index.jsp");
%>