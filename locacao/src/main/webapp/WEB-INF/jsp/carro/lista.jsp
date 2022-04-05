<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistena Locação Veículos</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<h2>Cadastramento de Carros</h2>
		<form action="/carro" method="get">
			<button type="submit" class="btn btn-primary">Novo</button>
		</form>

		<c:if test="${not empty listagem}">
			<p>Listagem de carros (${listagem.size()}):</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Placa</th>
						<th>Modelo</th>
						<th>Valor Diária</th>
						<th>Quilometragem</th>
						<th>Numero de Portas</th>
						<th>Tem Ar condicionado?</th>
						<th>Tem Ar quente?</th>
						<th>Tem cambio automático?</th>
						<th>Tem trava elétrica?</th>
						<th>Tem direcao hidráulica?</th>
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
							<td>${o.numeroPortas}</td>
							<td>${o.arCondicionado}</td>
							<td>${o.arQuente}</td>
							<td>${o.cambioAutomatico}</td>
							<td>${o.travaEletrica}</td>
							<td>${o.direcaoHidraulica}</td>
							<td><a href="/carro/${o.id}/excluir">excluir</a></td>
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