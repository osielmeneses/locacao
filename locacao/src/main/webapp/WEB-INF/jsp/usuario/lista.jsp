<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema Loca��o Ve�culos</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container mt-3">
	  <h2>Cadastramento de Usu�rios</h2>

	  <c:if test="${not empty listagem}">
	 	  <p>Listagem de usu�rios (${listagem.size()}):</p>            
		  <table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Nome</th>
		        <th>E-mail</th>
		        <th>Clientes</th>
		        <th>Ve�culos</th>
		        <th>Loca��es</th>
		        <c:if test="${usuarioLogado.admin}">
		        	<th></th>
		        </c:if>
		        
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="o" items="${listagem}">	
			      <tr>
			      	<td>${o.id}</td>
			        <td>${o.nome}</td>
			        <td>${o.email}</td>
			        <td>${o.clientes.size()}</td>
			        <td>${o.veiculos.size()}</td>			        
			        <td>${o.locacoes.size()}</td>
			        <c:if test="${usuarioLogado.admin}">
			        	<td><a href="/usuario/${o.id}/excluir">excluir</a></td>			        
			        </c:if>
			      </tr>
		      </c:forEach>
		    </tbody>
		  </table>
	  </c:if>
	  	
 	  <c:if test="${empty listagem}">
 	  	<p>N�o existem registros cadastrados!!!</p>
 	  </c:if> 	              
	</div>
</body>
</html>