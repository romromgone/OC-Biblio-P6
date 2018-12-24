<%@ include file="taglibs.jsp"%> 
<!DOCTYPE html>
<html lang="fr">

  <head>
    <%@ include file="head.jsp"%> 
    <link href="resources/css/infospersos.css" rel="stylesheet">
  </head>
	
	<body>
   	<%@ include file="menu.jsp" %>
    
    <main role="main" class="container-fluid">  	
	   	<div class="offset-md-3 col-md-6">
	     	<div class="card">
	 				<div class="card-header ">Infos Persos</div>
	 				<div class="card-body col-md-12">
	  				
		  				<div class="form-group row">
		    				<label class="col-md-4 col-form-label" for="prenom">Prénom</label>
		    				<div class="col-md-6">
		    					<input type="text" readonly class="form-control-plaintext" id="prenom" name="prenom" value="${session.usager.prenom}">			
		    				</div>
		  				</div>
		  				<div class="form-group row">
		    				<label class="col-md-4 col-form-label" for="nom">Nom</label>
		    				<div class="col-md-6">
		    					<input type="text" readonly class="form-control-plaintext" id="nom" name="nom" value="${session.usager.nom}">		    					
		    				</div>
		  				</div>
		  				<div class="form-group row">
		    				<label class="col-md-4 col-form-label" for="mail">Email</label>
		    				<div class="col-md-6">
		    					<input type="text" readonly class="form-control-plaintext" id="mail" name="mail" value="${session.usager.mail}">	    					
		    				</div>
		  				</div>
		  				<div class="form-group row">
		    				<label class="col-md-4 col-form-label" for="cp">Téléphone</label>
		    				<div class="col-md-6">
		    					<input type="text" readonly class="form-control-plaintext" id="cp" name="cp" value="${session.usager.telephone}">	    					
		    				</div>
		  				</div>
		  				<div class="form-group row">
		    				<label class="col-md-4 col-form-label" for="cp">Option de rappel :</label>
		    				<div class="col-md-6">
		    				<s:form method="post" action="modifierOptionRappel" id="form" name="form" > 
		    					<s:if test="%{usager.optionRappel == true}">		    				
					      		<s:submit class="btn btn-info btn-sm" value="Désactiver" />	 
					      	</s:if>
					      	<s:if test="%{usager.optionRappel == false}">				      	
					      		<s:submit class="btn btn-info btn-sm" value="Activer" />	 
					      	</s:if>	
				      	</s:form> 					
		    				</div>
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