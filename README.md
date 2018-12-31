## OC-Biblio-P6

### Suivre les instructions suivantes pour déployer l'application :

#### Base de données :
- Installer PostgreSQL 10.
- Pour migrer depuis le projet 4 : copier-coller dans psql (SQL Shell) le contenu du fichier "Script_SQL_Migration.txt" afin de mettre à jour la base.
- Sinon copier-coller dans psql le contenu du fichier "Script_SQL.txt" puis "Script_SQL_Migration.txt" afin de créer la base, les tables, et de la peupler avec le petit jeu de données.

#### WebService :
- Installer Glassfish 5.0-Full Platform.
- Démarrer Glassfish : exécuter "<glassfish_root>\bin\asadmin.bat" et taper "start-domain".
- Modifier le port d'écoute HTTP 8080 (car le même port sera utilisé par Tomcat) : sous l'administration Glassfish (localhost:4848) menu "Configurations\server-config\Network Listeners" changer le port de "http-listener-1" (8085 par exemple).  
- Extraire "bibliotheque-webservice-archive-properties.zip" dans "C:\Users\(user-name)" qui contient le fichier de propriétés de connexion à la BD.
- Modifier ce fichier "db.properties" avec les informations de votre BD.
- Déployer "bibliotheque-webservice.war" sous l'administration Glassfish (localhost:4848) dans le menu "Applications" et lancer l'application ("Launch").

#### WebApp :
- Installer Tomcat 10.
- Démarrer Tomcat : exécuter "<tomcat_root>/bin/startup.bat".
- Déployer "bibliotheque-webapp.war" sous l'administration Tomcat (localhost:8080) dans le menu "Manager App" et lancer l'application ("Démarrer").
- Modifier le fichier de propiétés "webapp.properties" contenant l'adresse des wsdl du WebService se trouvant dans le dossier de déploiement Tomcat "<tomcat_root>\webapps\bibliotheque-webapp\WEB-INF-classes".

La page d'accueil de la webapp est disponible à l'adresse suivante : http://localhost:8080/bibliotheque-webapp/

#### Batchs :
- Dézipper "bibliotheque-batch-archive-deploy.zip" n'importe où.
- Modifier le fichier de propiétés "bibliotheque-batch-0.0.1-SNAPSHOT\conf\batch.properties" contenant l'adresse des wsdl du WebService, les informations du serveur mail, et la propriété de programation d'envoie des mails. 
- Lancer les batchs : exécuter "bibliotheque-batch-0.0.1-SNAPSHOT\bin\batch.bat".

Les batch sont maintenant en cours d'exécution et les mails seront envoyés selon la programmation choisie.
