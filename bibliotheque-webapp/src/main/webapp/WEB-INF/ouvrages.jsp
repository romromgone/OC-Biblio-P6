<%@ include file="taglibs.jsp"%> 
<!DOCTYPE html>
<html lang="fr">

  <head>
    <%@ include file="head.jsp"%> 
    <link href="resources/css/ouvrages.css" rel="stylesheet">
  </head>
	
	<body>
   	<%@ include file="menu.jsp" %>
    
    <main role="main" class="container-fluid">
			
	   	<div class="offset-md-1 col-md-10">
	     	<div class="card">
	 				<div class="card-header ">Entrer le titre et l'auteur de l'ouvrage pour faire une recherche</div>
	 				<div class="card-body col-md-12">
						<p></p>
						<div class="row">
							<s:form method="post" action="rechercher" id="rechercheForm" name="rechercheForm" >		  					
								<s:textfield class="form-control mr-md-2" name="titre" id="titre" label="Titre"/>
								<s:textfield class="form-control mr-md-2" name="auteur" id="auteur" label="Auteur"/>
								<s:submit class="btn btn-info" value="Rechercher" />	
							</s:form>								
						</div>									
									

						<p></p>
	      			<div class="row">      			      			
	       			<table class="table table-striped">
							  <thead>
							    <tr>
							      <th scope="col">Titre</th>
							      <th scope="col">Auteur</th>
							      <th scope="col">Classification</th>
							      <th scope="col">R�sum�</th>
							      <th scope="col">Exemplaires disponibles</th>
							    </tr>
							  </thead>
							  <tbody>
							  <tr>
							  	<s:iterator value="listeRechercheOuvrages"> 		       									    
							      <td><s:property value="titre" /></td>
							      <td><s:property value="auteur" /></td>
							      <td><s:property value="classification" /></td>
							      <td>
							      	<details>
											  <summary>Voir la description</summary>
											  <p><s:property value="resume" /></p>
											</details>									      	
							      </td>							     
							      <td><b><s:property value="nbExemplairesDispos" /></b></td>
				        	</s:iterator>	
						    </tr>
							    						   
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