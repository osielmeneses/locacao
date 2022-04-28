<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema Locação Veículos</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h2>Cadastramento de Clientes</h2>
		<form action="/cliente" method="get">
			<button type="submit" class="btn btn-primary">Novo</button>
		</form>

		<c:if test="${not empty listagem}">
			<p>Listagem de clientes (${listagem.size()}):</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome</th>
						<th>CPF</th>
						<th>Número da CNH</th>
						<th>Categoria da CNH</th>
						<th>Telefone</th>
						<th>Email</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="o" items="${listagem}">
						<tr>
							<td>${o.id}</td>
							<td>${o.nome}</td>
							<td>${o.cnh}</td>
							<td>${o.categoriaCnh}</td>
							<td>${o.telefone}</td>
							<td>${o.email}</td>
							<td><a href="/cliente/${o.id}/excluir">excluir</a></td>
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