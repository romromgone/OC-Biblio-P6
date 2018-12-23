<%@ include file="taglibs.jsp"%> 

<link href="resources/css/menu.css" rel="stylesheet">
    
<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
  <div class="container-fluid">
  
		<img class="navbar-brand mb-0" src="resources/favicon.png" width="38" height="45" alt="">
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		  <span class="navbar-toggler-icon"></span>
		</button>
		
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
		  <ul class="navbar-nav mr-auto">
		    <li class="nav-item">
		      <a class="nav-link" id="navAccueil" href="index.jsp">Accueil</a>
		    </li>
		    <li class="nav-item">
		    	<s:if test="#session.usager">	
		    		<s:a class="nav-link" action="rechercher" id="navOuvrages"> Rechercher un ouvrage</s:a>
	    		</s:if>
	    		<s:else>
	    			<s:a class="nav-link disabled" action="#" id="navOuvrages"> Rechercher un ouvrage</s:a>
	    		</s:else>	     
		    </li>
		    <li class="nav-item">
		    	<s:if test="#session.usager">	
		    		<s:a class="nav-link" action="emprunts" id="navEmprunts"> Mes emprunts</s:a>
	    		</s:if>
	    		<s:else>
	    			<s:a class="nav-link disabled" action="#" id="navEmprunts"> Mes emprunts</s:a>
	    		</s:else>	
		    </li>
		    <li class="nav-item">
		    	<s:if test="#session.usager">	
		    		<s:a class="nav-link" action="reservations" id="navReservations"> Mes réservations</s:a>
	    		</s:if>
	    		<s:else>
	    			<s:a class="nav-link disabled" action="#" id="navReservations"> Mes réservations</s:a>
	    		</s:else>	
		    </li>
		  </ul>
		  <ul class="navbar-nav ml-auto">
		    <li class="dropdown">
		      <button class="btn btn-outline-info dropdown-toggle" id="btnUser" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="fas fa-user" aria-hidden="true"></span></button>
		      <div class="dropdown-menu dropdown-menu-right">
		      
	      		<%-- Vérification de la présence d'un objet utilisateur en session --%>
	            
	            <s:if test="#session.usager">		 						 							
								<div class="card">
								  <div class="card-header ">Boujour  <s:property value="#session.usager.prenom" /></div> 								  					  									
 									<div class="list-group list-group-flush">
									  <s:a action="infospersos" class="list-group-item list-group-item-action" id="dropdownInfos">Infos persos</s:a>
									  <s:a action="emprunts" class="list-group-item list-group-item-action" id="dropdownEmprunts">Mes emprunts</s:a>
									  <s:a action="reservations" class="list-group-item list-group-item-action" id="dropdownReservations">Mes réservations</s:a>
									  <s:a action="deconnexion" class="list-group-item list-group-item-dark" id="dropdownDeco">Déconnexion</s:a>
									</div>
 								</div>	 													
 							</s:if> 
 							
 							<s:else>				  						
  							<s:form class="px-2 py-2" method="post" action="connexion" id="form" name="form" >                        
	          			<h5>Se connecter</h5>
	          			<div class="form-group" id="form-group">				      				     
	            			<s:textfield class="form-control form-control-sm" name="mail" id="mail" placeholder="Adresse mail" requiredLabel="true" required="required" style="margin-top:2px" /> 					     
	            			<s:password class="form-control form-control-sm" name="mdp" id="mdp" placeholder="Mot de passe" requiredLabel="true" required="required" style="margin-top:2px" />
	          			</div>		    
	          			<s:submit class="btn btn-info btn-block btn-sm" value="Valider" />		          			          
	        			</s:form>							
 							</s:else>
	 							        
		      </div>
		    </li>
		  </ul>		
		</div>
	  
	</div> 
</nav>