<%-- 
    Document   : administracion
    Created on : 4/02/2014, 09:06:03 PM
    Author     : T107
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../recursos/estilos-cuentas.css"/> <%-- Link a nuestro estilo de cascadda dentro de recursos --%>
        <script src="../recursos/js/libs/jquery/jquery.js"></script> <%--Cargamos la libreria jqueri  --%>
        <script>
            $(document).ready(function (){
                alert("Se cargo bien el jquery");
            });
            
            
            
            </script>
    </head>
    <body>
        <ul>
            <li>Cuenta</li>
            <li>Altas</li>
            <li>Bajas</li>
            <li>Busqueda</li>
            <li>Actualizar</li>
        </ul>
        <h1>Bienvenido a tu banco</h1>
        ${cualquiernombre} <-- Nombre que viene de la capa controller -->
    </body>
</html>
