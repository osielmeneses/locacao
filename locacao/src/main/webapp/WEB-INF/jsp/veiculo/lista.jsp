<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema Locação Veículos</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<!--  
private Integer id;
	private String placa;
	private String modelo;
	private float valorDiaria;
	private long quilometragem;
-->
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container mt-3">
	  <h2>Cadastramento de Veículos</h2>

	  <c:if test="${not empty listagem}">
	 	  <p>Listagem de veículos (${listagem.size()}):</p>            
		  <table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Placa</th>
		        <th>Modelo</th>
		        <th>Valor da diária</th>
		        <th>Quilometragem</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="o" items="${listagem}">	
			      <tr>
			      	<td>${o.id}</td>
			        <td>${o.placa}</td>
			        <td>${o.modelo}</td>
			        <td>${o.valorDiaria}</td>
			        <td>${o.quilometragem}</td>
			        <td><a href="/veiculo/${o.id}/excluir">excluir</a></td>
			      </tr>
		      </c:forEach>
		    </tbody>
		  </table>
	  </c:if>
	  	
 	  <c:if test="${empty listagem}">
 	  	<p>Não existem registros cadastrados!!!</p>
 	  </c:if> 	              
	</div>
</body>
</html>