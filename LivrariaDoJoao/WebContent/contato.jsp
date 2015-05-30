<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt">
<head>
<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Jornal Sapere Aude">
	<meta name="author" content="Crislanio">

	<title>Contate-no</title>

	<!-- CSS -->
	<link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<link href="assets/css/font-awesome.min.css" rel="stylesheet" media="screen">
	<link href="assets/css/simple-line-icons.css" rel="stylesheet" media="screen">
	<link href="assets/css/animate.css" rel="stylesheet">
    
	<!-- Custom styles CSS -->
	<link href="assets/css/style.css" rel="stylesheet" media="screen">
    
    <script src="assets/js/modernizr.custom.js"></script>
   	
</head>
<body>
	<c:import url="includes/cabecalho.jsp"/>
	
	<!-- Contact start -->

	<section id="contact" class="pfblock">
		<div class="container">
			<div class="row">

				<div class="col-sm-6 col-sm-offset-3">

					<div class="pfblock-header">
						<h2 class="pfblock-title">Contate-nos</h2>
						<div class="pfblock-line"></div>
						<div class="pfblock-subtitle">
				</br>	
				<img src="img/cris225x300.jpg" alt="autor">
				</br>
				<b><span style="color: #ff6600;">Localização</span>
				<ul >
					<li>Rua Laerte Pinheiro, 10</li>
					<li>Centro</li>
					<li>Quixadá-CE</li>
				</ul>
				<b><span style="color: #ff6600;">Contato Direto</span>
				<ul >
					<li>fone:<strong>(88) 9949-3257</strong></li>
					<li>Email:<strong>crilaniomacedo@live.com</strong></li>
					</p>
				
				</ul>
			</div>
						</div>
					</div>

				</div>

			</div><!-- .row -->

			<div class="row">

				<div class="col-sm-6 col-sm-offset-3">

					<form id="contact-form" role="form">
						<div class="ajax-hidden">
							<div class="form-group wow fadeInUp">
								<label class="sr-only" for="c_name">Name</label>
								<input type="text" id="c_name" class="form-control" name="c_name" placeholder="Nome">
							</div>

							<div class="form-group wow fadeInUp" data-wow-delay=".1s">
								<label class="sr-only" for="c_email">Email</label>
								<input type="email" id="c_email" class="form-control" name="c_email" placeholder="E-mail">
							</div>

							<div class="form-group wow fadeInUp" data-wow-delay=".2s">
								<textarea class="form-control" id="c_message" name="c_message" rows="7" placeholder="Mensagem"></textarea>
							</div>

							<button type="submit" class="btn btn-lg btn-block wow fadeInUp" data-wow-delay=".3s">Enviar Mensagme</button>
						</div>
						<div class="ajax-response"></div>
					</form>

				</div>

			</div><!-- .row -->
		</div><!-- .container -->
	</section>

	<!-- Contact end -->
	

  <!-- CallToAction start -->

	<section class="calltoaction">
		<div class="container">

			<div class="row">

				<div class="col-md-12 col-lg-12">
					<h2 class="wow slideInRight" data-wow-delay=".1s">MÉTODO ALTERNATIVO DE CONTATO</h2>
					<div class="calltoaction-decription wow slideInRight" data-wow-delay=".2s">
						<section>
							<p>Caso não consiga me contatar por alguns dos meios acima, possivelmente eu estarei em uma ilha deserta em algum lugar do pacífico. Neste caso há duas possibilidades:</p>
							<ol>
								<li>Enviar uma mensagem em uma garrafa</li>
								<li>Tentar um sinal de fumaça</li>
							</ol>
							<p>Mas sinceramente não sei se algum desses métodos será eficiente , tente por sua conta e risco :D</p>
						</section>
					</div>
				</div>

				<div class="col-md-12 col-lg-12 calltoaction-btn wow slideInRight" data-wow-delay=".3s">
					<a href="#contact" class="btn btn-lg">Deixe sua opinião</a>
				</div>

			</div><!-- .row -->
		</div><!-- .container -->
	</section>

	<!-- CallToAction end -->
	
	<footer> <c:import url="includes/rodape.jsp" /> </footer>
</body>
</html>







