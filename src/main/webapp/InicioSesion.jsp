<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema De inicio de Sesion</title>
</head>
<body style="background:#85B8B4;">
    <h1 align="center">INGRESAR AL SISTEMA</h1>
    
    <form action="servletIni" method="post">
    <table align="center" border="1">
       <tr>
       <td>usuario</td>
       <td><input type="text" name="usuario"></td>
       </tr>
       
       <tr>
       <td>contraseña</td>
       <td><input type="password" name="contraseña"></td>
       </tr>
    
 
   		<tr align="center">
		<td colspan="3">
         <button type="submit"> Iniciar Sesion </button>
		</td>
		</tr>
	
    </table>
    </form>


</body>
</html>