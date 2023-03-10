<%--
  Created by IntelliJ IDEA.
  User: djail
  Date: 24/02/2023
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Peso Ideal</title>
</head>
<body>
<h1>Cálculo de Peso Ideal</h1>
<form name="bmiForm" action="pesoIdeal" method="GET">
    <table>
        <tr>
            <td><label for="sexo">Sexo:</label></td>
            <td><input type="text" name="sexo" id="sexo"/></td>
        </tr>
        <tr>
            <td><label for="altura">Sua altura (m) :</label></td>
            <td><input type="text" name="altura" id="altura"/></td>
        </tr>
        <tr>
            <th><input type="submit" value="Enviar" name="find"/></th>
            <th><input type="reset" value="Limpar" name="reset"/></th>
        </tr>
    </table>
    <%--    <h2>${imc}</h2>--%>
    <h2>O peso ideal é: ${pesoIdeal}</h2>
</form>
</body>
</html>