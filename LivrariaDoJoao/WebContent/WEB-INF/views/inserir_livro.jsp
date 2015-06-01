<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="pt">
<head>   	
</head>

<body>
	<c:import url="/includes/cabecalho.jsp"/>
	<h1>Inserir Livro</h1>
	
	
	<form  action="adicionarLivro" method="post">
		Nome: <input type="text" name="nome" /> <br />
		<form:errors cssStyle="color:red" path="livro.nome"/> <br />

		<label>Ação</label> <select
					name="categoria" required>
					<option selected value="aventura">Aventura</option>
					<option selected value="drama">Drama</option>
					<option selected value="comedia">Comédia</option>
		</select><br /> 
								
		Valor: <input type="text" name="valor" /> <br />
		<form:errors cssStyle="color:red" path="livro.valor"/> <br />
		Quantidade em estoque: <input type="text" name="qtdEstoque" /> <br />
		<form:errors cssStyle="color:red" path="livro.qtdEstoque"/> <br />
		
		<input type="submit" value="Inserir" /> <br />
	</form>
	<div class="linha">
	
	<div class="linha">
		<section>
			<c:import url="/includes/secao_extra.jsp" />
			<footer>
				<c:import url="/includes/rodape.jsp" />
			</footer>
		</section>
	</div>
	
	
</body>
</html>