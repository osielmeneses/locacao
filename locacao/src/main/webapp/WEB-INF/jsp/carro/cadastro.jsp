<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistena Loca??o Ve?culos</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h2>Cadastramento de Carros</h2>
		<form action="/carro/incluir" method="post">
			<div class="mb-3 mt-3">
				<label>Modelo:</label> <input type="text" class="form-control"
					placeholder="Entre com o Modelo" name="modelo">
			</div>

			<div class="mb-3 mt-3">
				<label>Valor da di?ria:</label> <input type="text" class="form-control"
					placeholder="Entre com o valor da di?ria" name="valorDiaria">
			</div>

			<div class="mb-3 mt-3">
				<label>Placa:</label> <input type="text" class="form-control"
					placeholder="Entre com a Placa" name="placa">
			</div>

			<div class="mb-3 mt-3">
				<label>Quilometragem:</label> <input type="text" class="form-control"
					placeholder="Entre com a Quilometragem" name="quilometragem">
			</div>
			
			<div class="mb-3 mt-3">
				<label>N?mero de portas:</label> <input type="text" class="form-control"
					placeholder="Entre com o n?mero de portas" name="numeroPortas">
			</div>

			<div class="mb-3 mt-3">
				<label>Caracter?sticas:</label>
				<div class="checkbox">
					<label><input type="checkbox" value="true" name="arCondicionado">
						Tem ar condicionado?</label>
				</div>
				<div class="checkbox">
					<label><input type="checkbox" value="false" name="arQuente">
						Tem ar quente?</label>
				</div>
				<div class="checkbox">
					<label><input type="checkbox" value="false" name="cambioAutomatico">
						? cambio autom?tico?</label>
				</div>
				<div class="checkbox">
					<label><input type="checkbox" value="false" name="travaEletrica">
						Tem trava el?trica?</label>
				</div>
				<div class="checkbox">
					<label><input type="checkbox" value="false" name="direcaoHidraulica">
						Tem direcao hidr?ulica?</label>
				</div>
			</div>

			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>