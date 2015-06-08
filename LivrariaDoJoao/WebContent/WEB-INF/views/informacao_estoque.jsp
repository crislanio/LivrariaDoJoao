
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
	<c:import url="/includes/cabecalho.jsp"/>
	
		
	<h1>
		Total de Vendas: <b>${vendas}</b>
	</h1>
	<h2>
		Lucro: <b>${lucro}</b>
	</h2>
	
	<div class="linha">
		<section>
			<c:import url="/includes/secao_extra.jsp"/>
	<footer> <c:import url="/includes/rodape.jsp" /> </footer>
		</section>
	</div>
</body>
</html>