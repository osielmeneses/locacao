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
		<h2>Cadastramento de Motos</h2>
		<form action="/moto/incluir" method="post">
			<div class="mb-3 mt-3">
				<label>Modelo:</label> <input type="text" class="form-control"
					placeholder="Entre com o Modelo" name="modelo">
			</div>

			<div class="mb-3 mt-3">
				<label>Valor da diária:</label> <input type="text" class="form-control"
					placeholder="Entre com o valor da diária" name="valorDiaria">
			</div>

			<div class="mb-3 mt-3">
				<label>Placa:</label> <input type="text" class="form-control"
					placeholder="Entre com a Placa" name="placa">
			</div>

			<div class="mb-3 mt-3">
				<label>Quilometragem:</label> <input type="text" class="form-control"
					placeholder="Entre com a Quilometragem" name="quilometragem">
			</div>
			
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>