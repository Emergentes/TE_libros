<jsp:useBean id="libro" scope="request" class="com.emergentes.modelo.Libro" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nuevo libro</h1>
        <form action="MainController" method="post">
            <table>
                <input type="hidden" name="id" value="<jsp:getProperty name="libro" property="id" />">
                <tr>
                    <td>ISBN</td>
                    <td><input type="text" name="isbn" value="<jsp:getProperty name="libro" property="isbn" />"></td>                  
                </tr>
                <tr>
                    <td>Titulo</td>
                    <td><input type="text" name="titulo" value="<jsp:getProperty name="libro" property="titulo" />"></td>
                </tr>
                <tr>
                    <td>Categoria</td>
                    <td><input type="text" name="categoria" value="<jsp:getProperty name="libro" property="categoria" />"></td>
                </tr>            
                <tr>
                    <td></td>
                    <td><input type="submit" value="Enviar" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
