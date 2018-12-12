<%@ include file="taglibs.jsp"%> 
<!DOCTYPE html>
<html lang="fr">

  <head>
    <%@ include file="head.jsp"%> 
    <link href="resources/css/emprunts.css" rel="stylesheet">
  </head>
	
	<body>
   	<%@ include file="menu.jsp" %>
    
    <main role="main" class="container-fluid">		
	   	<div class="offset-md-1 col-md-10">
	     	<div class="card">
	 				<div class="card-header ">Mes emprunts</div>
	 				<div class="card-body col-md-12">
	 					<h5 class="card-title">Emprunts en cours</h5>
	 					
						<div class="row">      			      			
	       			<table class="table table-striped">
							  <thead>
							    <tr>
							      <th scope="col">Titre</th>		
							      <th scope="col">Auteur</th>					      
							      <th scope="col">Date début de prêt</th>
							      <th scope="col">Date retour de prêt</th>
							      <th scope="col">Pronlongé</th>
							      <th scope="col"></th>
							    </tr>
							  </thead>
							  <tbody>				  
							  	<s:iterator value="empruntsEnCours">  						  		      					
								    <tr>
								      <td><s:property value="exemplaire.edition.ouvrage.titre" /></td>
								      <td><s:property value="exemplaire.edition.ouvrage.auteur" /></td>
								      <td><s:property value="dateDeb" /></td>
								      <td><span class="text-info"><s:property value="dateFin" /></span></td>
								      <s:set var="estProlonge" value="prolonge"/>						      
								      <td><s:if test="%{#estProlonge==true}">Oui</s:if><s:else>Non</s:else></td>
								      <td>							      	
								      	<s:if test="%{#estProlonge == false}">
									      	<s:form method="post" action="prolonger" id="form" name="form" > 
									      	 	<s:hidden name="idExemplaire" id="idExemplaire" />
									      	  <s:hidden name="dateDeb" id="dateDeb" />
									      		<s:submit class="btn btn-info btn-sm" value="Prolonger" />
									      	</s:form>
								      	</s:if>
							      	</td>
								    </tr>
							    </s:iterator>								   
							  </tbody>
							</table>
						</div>
						<p></p>
						<h5 class="card-title" >Emprunts non rendus :</h5>
						<p class="card-text">Merci de nous rapporter ces exemplaires dans les plus brefs délais. Vous ne pouvez pas pronlonger ces prêts.</p>
						<div class="row">      			      			
	       			<table class="table table-striped">
							  <thead>
							    <tr>
							      <th scope="col">Titre</th>		
							      <th scope="col">Auteur</th>					      
							      <th scope="col">Date début de prêt</th>
							      <th scope="col">Date retour dépassée depuis le</th>
							      <th scope="col">Pronlongé</th>
							    </tr>
							  </thead>
							  <tbody>						  		
        					<s:iterator value="empruntsNonRendus">  	      					
								    <tr>
								      <td><s:property value="exemplaire.edition.ouvrage.titre" /></td>
								      <td><s:property value="exemplaire.edition.ouvrage.auteur" /></td>
								      <td><s:property value="dateDeb" /></td>
								      <td><span class="text-danger"><s:property value="dateFin" /></span></td>
								      <s:set var="estProlonge" value="prolonge"/>						      
								      <td><s:if test="%{#estProlonge==true}">Oui</s:if><s:else>Non</s:else></td>							    
								    </tr>
							    </s:iterator>							   
							  </tbody>
							</table>
						</div>
			  	</div>
     		</div>
      </div>
        
    
    </main>
    
    <script src="webjars/jquery/3.2.1/jquery.min.js"></script>
	  <script src="webjars/popper.js/1.11.1/dist/umd/popper.min.js"></script>
	  <script src="webjars/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
 
  </body>
</html>