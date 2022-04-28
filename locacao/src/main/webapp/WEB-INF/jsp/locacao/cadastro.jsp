<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loca��o Ve�culos</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container mt-3">
	  <h2>Cadastro de Loca��o de Ve�culos</h2>
	  <form action="/locacao/incluir" method="post">

	    <div class="mb-3 mt-3">
	      <label>Cliente:</label>
	      <select name="cliente.id" class="form-control">
	      		<c:forEach var="s" items="${clientes}">
	      			<option value="${s.id}">${s.nome}</option>
	      		</c:forEach>
	      </select>
	    </div>
	    
	     <div class="mb-3 mt-3">
	      <label>Ve�culos:</label>
			<div class="checkbox">
				<c:forEach var="p" items="${veiculos}">
      			<label><input type="checkbox" value="${p.id}" name="idsVeiculos" checked> ${p.modelo}</label>
      			</c:forEach>
    		</div>
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Data da Retirada:</label>
	      
	      <input type="text" class="form-control" placeholder="Entre com a data da retirada do ve�culo"  name="dataRetirada" value="01/09/2022">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Local de Retirada:</label>
	      <input type="text" class="form-control" placeholder="Entre o local da retirada do ve�culo" name="localRetirada" value="Local retirada">
	    </div>
	    
	     <div class="mb-3 mt-3">
	      <label>Data da Devolu��o:</label>
	      <input type="text" class="form-control" placeholder="Entre com a data da devolu��o do ve�culo" name="dataDevolucao" value="10/09/2022">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Local da Devolu��o:</label>
	      <input type="text" class="form-control" placeholder="Entre o local da devolu��o do ve�culo" name="localDevolucao" value="Local devolu��o">
	    </div>
	    

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
</body>
</html>