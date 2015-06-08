
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
	<c:import url="/includes/cabecalho.jsp"/>
	
		<table align="center" border="1px" width="80%">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Valor</th>
				<th>Quantidade Estoque</th>
				<th>Categoria</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="livro" items="${livros}">
				<tr ng-repeat="livro in livros">

					<td>${livro.id}</td>
					<td>${livro.nome}</td>
					<td>${livro.valor}</td>
					<td>${livro.qtdEstoque}</td>
					<td>${livro.categoria}</td>
				
					<c:if test="${livro.qtdEstoque >0 }">
						<td><a href="processaVendaLivro?id=${livro.id}"> Comprar Livro </a></td>
					</c:if>	
				
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="linha">
		<section>
			<c:import url="/includes/secao_extra.jsp"/>
	<footer> <c:import url="/includes/rodape.jsp" /> </footer>
		</section>
	</div>
</body>
</html>