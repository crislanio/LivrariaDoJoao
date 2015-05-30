<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt">
<head>
</head>
<body>
	<c:import url="/includes/cabecalho.jsp"/>

	<div class="pfblock-header wow fadeInUp">
						<div class="pfblock-line"></div>
						<div class="pfblock-subtitle">
	O livro <b>${param.nome}</b> foi adicionado com sucesso!<br />	
	</div>
	</div>
					
					
	<div class="linha">
		<section>
			<c:import url="/includes/secao_extra.jsp"/>
		<footer> <c:import url="/includes/rodape.jsp" /> </footer>
	</section>
	</div>
</body>
</html>
	