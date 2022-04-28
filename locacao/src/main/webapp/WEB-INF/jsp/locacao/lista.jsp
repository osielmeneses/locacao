<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Locação de Veículos</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container mt-3">
	  <h2>Cadastro de Locação de Veículos</h2>
	  <form action="/locacao" method="get">
	    <button type="submit" class="btn btn-primary">Novo</button>
	  </form>
	  
	  <c:if test="${not empty listagem}">
	 	  <p>Listagem de locações (${listagem.size()}):</p>            
		  <table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Descrição</th>
		        <th>Data da Solicitação</th>
		        <th>Local da Retirada do Veículo</th>
		        <th>Data da Retirada do Veículo</th>
		        <th>Local da Devolução do Veículo</th>
		        <th>Data da Devolução do Veículo</th>
		        <th>Cliente</th>
		        <th>Valor Total</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="o" items="${listagem}">	
			      <tr>
			      	<td>${o.id}</td>
			        <td>${o.descricao}</td>
			        <td>${o.data}</td>
			        <td>${o.dataRetirada}</td>
			        <td>${o.localRetirada}</td>
			        <td>${o.dataDevolucao}</td>
			        <td>${o.localDevolucao}</td>
			        <td>${o.cliente.nome}</td>
			        <td>${o.valorLocacao}</td>
			        <td><a href="/locacao/${o.id}/excluir">excluir</a></td>
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