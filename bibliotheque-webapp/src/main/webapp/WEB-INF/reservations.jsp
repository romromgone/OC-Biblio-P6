<%@ include file="taglibs.jsp"%> 
<!DOCTYPE html>
<html lang="fr">

  <head>
    <%@ include file="head.jsp"%> 
    <link href="resources/css/reservations.css" rel="stylesheet">
  </head>
	
	<body>
   	<%@ include file="menu.jsp" %>
    
    <main role="main" class="container-fluid">		
	   	<div class="offset-md-1 col-md-10">
	     	<div class="card">
	 				<div class="card-header ">Mes réservations en cours</div>
	 				<div class="card-body col-md-12">
	 								
						<div class="row">      			      			
	       			<table class="table table-striped">
							  <thead>
							    <tr>
							      <th scope="col">Titre</th>		
							      <th scope="col">Auteur</th>
							      <th scope="col">Classification</th>			
							      <th scope="col">Position dans la liste d'attente</th>			      
							      <th scope="col">Prochaine date de retour</th>							      				     
							      <th scope="col">Action</th>
							    </tr>
							  </thead>
							  <tbody>			
							  	<s:iterator value="reservationsEnCours">	
								  	 <tr>	  						  		
								      <td><b><s:property value="ouvrage.titre"/></b></td>
								      <td><s:property value="ouvrage.auteur"/></td>
								      <td><s:property value="ouvrage.classification"/></td>
								      <td style="color: #17a2b8;"><b><s:property value="position"/></b></td>							 	
								     	<td><s:property value="%{empruntServiceField.getDateRetourPlusProcheParOuvrage(idOuvrage)}"/></td>							      
								      <td>							  				      
								      	<s:form method="post" action="annuler" id="form" name="form" > 
								      	 	<s:hidden name="position" id="position" />
								      	  <s:hidden name="idOuvrage" id="idOuvrage" />
								      		<s:submit class="btn btn-info btn-sm" value="Annuler" />
								      	</s:form>
							      	</td>		
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