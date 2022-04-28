<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistena Locação Veículos</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h2>Cadastramento de Clientes</h2>
		<form action="/cliente/incluir" method="post">
			<div class="mb-3 mt-3">
				<label>Nome:</label> <input type="text" class="form-control"
					placeholder="Entre com o nome do cliente" name="nome">
			</div>

			<div class="mb-3 mt-3">
				<label>Cpf:</label> <input type="text" class="form-control"
					placeholder="Entre com o cpf do cliente" name="cpf">
			</div>

			<div class="mb-3 mt-3">
				<label>Número da CNH:</label> <input type="text" class="form-control"
					placeholder="Entre com o número da CNH do cliente" name="cnh">
			</div>

			<div class="mb-3 mt-3">
				<label>Categoria da CNH:</label> <input type="text" class="form-control"
					placeholder="Entre com a categoria da CNH do cliente" name="categoriaCnh">
			</div>
			
			<div class="mb-3 mt-3">
				<label>Telefone:</label> <input type="text" class="form-control"
					placeholder="Entre com o telefone do cliente" name="telefone">
			</div>
			
			<div class="mb-3 mt-3">
				<label>Email:</label> <input type="text" class="form-control"
					placeholder="Entre com o e-mail do cliente" name="email">
			</div>

			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>