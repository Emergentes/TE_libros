<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.emergentes.Libro"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.emergentes.ConexionDB"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de libros</h1>
        <p><a href="nuevo.jsp">Nuevo</a></p>
        <table border="1">
            <tr>
                <th>ISBN</th>
                <th>Titulo</th>
                <th>Categoria</th>
                <th></th>
            </tr>
        <%
            List<Libro> lista = null;
            
            lista = Libro.getAll();
            
            for(Libro libro : lista){
        %>
        <tr>
            <td><%=libro.getIsbn()%></td>
            <td><%=libro.getTitulo()%></td>
            <td><%=libro.getCategoria()%></td>
            <td><a href="elimina.jsp?id=<%=libro.getId()%>">Eliminar</a></td>
        </tr>
        <%
            }
        %>
        </table>

    </body>
</html>
