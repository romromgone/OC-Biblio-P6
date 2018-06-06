<%@ include file="WEB-INF/taglibs.jsp"%> 
<!DOCTYPE html>
<html lang="fr">

  <head>
  	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="WEB-INF/head.jsp"%> 
    <link href="resources/css/accueil.css" rel="stylesheet">
  </head>

  <body>
    <%@ include file="WEB-INF/menu.jsp" %>
    
    <main role="main" class="container">
      <div>
      	<img src="resources/bandeau.jpg" alt="bandeau" >
        <h1>Bienvenue dans l'appli web de votre Bibliothèque !</h1>
        <p class="lead">
        	Ici vous pouvez : rechercher un ouvrage et le nombre d’exemplaires disponibles, suivre vos prêts en cours et les prolonger.
        	<br />Veuillez vous identifier pour accéder à ces fonctionnalités.
        	<s:actionmessage id="msg"/>
        	<s:actionerror id="err"/>
        </p>
        
      </div>
    </main>
    
    <script src="webjars/jquery/3.2.1/jquery.min.js"></script>
	  <script src="webjars/popper.js/1.11.1/dist/umd/popper.min.js"></script>
	  <script src="webjars/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    
  </body>
</html>