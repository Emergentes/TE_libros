<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nuevo libro</h1>
        <form action="insertar.jsp" method="post">
            <table>
                <tr>
                    <td>ISBN</td>
                    <td><input type="text" name="isbn" /></td>                  
                </tr>
                <tr>
                    <td>Titulo</td>
                    <td><input type="text" name="titulo" /></td>
                </tr>
                <tr>
                    <td>Categoria</td>
                    <td><input type="text" name="categoria" /></td>
                </tr>            
                <tr>
                    <td></td>
                    <td><input type="submit" value="Enviar" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
