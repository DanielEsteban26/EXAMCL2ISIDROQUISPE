<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"  %>
<%@page import="model.TblProductocl2" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title ></title>
</head>
<body style="background: #8DBDE6">

<h1 align="center" style="padding: 20px; color:white ; background: red;">Sistema de Gestion Producto</h1>

<br>
<h2 align="center">REGISTRAR PRODUCTO</h2>

<form action="servletPro" method="post">

<table border="1" align="center">
<tr>
<td>nombre</td>
<td><input type="text" name="nombre"></td>
</tr>

<tr>
<td>precio Venta</td>
<td><input type="text" name="precioVe"></td>
</tr>

<tr>
<td>precio Compra</td>
<td><input type="text" name="precioCo"></td>
</tr>


<tr>
<td>estado</td>
<td><select name="estado" >
            <option>--seleccione--</option>
            <option>Vigente</option>
            <option>Caducado</option>
     </select>
</td>
</tr>


<tr>
<td>Descripcion</td>
<td><input type="text" name="descripcion"></td>
</tr>


<tr align="center">
<td colspan="3">
<button type="submit"> Registrar Producto </button>
</td>
</tr>

</table>

</form>


<h1 align="center">Listado de Productos</h1>

<table align="center" border="2">

<tr>

<th>Codigo</th>

<th>nombre</th>

<th>precio venta</th>

<th>precio compra</th>

<th>estado</th>

<th>descripcion</th>

</tr>

<%

List<TblProductocl2> ListadoProducto=(List<TblProductocl2>)request.getAttribute("list");
if(ListadoProducto!=null){
	for(TblProductocl2 lis:ListadoProducto){
%>
<tr>
<td>
<%=lis.getIdproductocl2()%>
</td>
<td>
<%=lis.getNombrecl2()%>
</td>
<td>
<%=lis.getPrecioventacl2()%>
</td>
<td>
<%=lis.getPreciocompcl2()%>
</td>
<td>
<%=lis.getEstadocl2()%>
</td>
<td>
<%=lis.getDescripcl2() %>
</td>
</tr>
<%
	}
}
%>

</table>
</body>
</html>