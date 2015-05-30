
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
		Listar Livros: <b>${tamanho}</b>
	</h1>

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
					<td><a href="deletarLivro?id=${livro.id}"> Excluir </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<footer> <c:import url="/includes/rodape.jsp" /> </footer>

</body>
</html>