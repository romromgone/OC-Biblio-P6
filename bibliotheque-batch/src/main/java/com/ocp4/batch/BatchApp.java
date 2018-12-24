package com.ocp4.batch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;

import com.ocp4.batch.beans.EmailConnexion;
import com.ocp4.batch.beans.WsdlLocation;


@SpringBootApplication(scanBasePackages = "com.ocp4.batch")
@PropertySource("file:D:/Documents/Romain/Documents/eclipse-workspace/OC-Biblio-P6/bibliotheque-batch/src/data/conf/batch.properties")
@EnableScheduling
public class BatchApp {
	@Value("${WSDLLocationUsager}")
    private String wsdlLocationUsager;
    @Value("${WSDLLocationOuvrage}")
    private String wsdlLocationOuvrage;
    @Value("${WSDLLocationEdition}")
    private String wsdlLocationEdition;
    @Value("${WSDLLocationExemplaire}")
    private String wsdlLocationExemplaire;
    @Value("${WSDLLocationEmprunt}")
    private String wsdlLocationEmprunt;
    @Value("${WSDLLocationReservation}")
    private String wsdlLocationReservation;
    
    @Value("${emailHost}")
    private String emailHost;
    @Value("${emailFrom}")
    private String emailFrom;
    @Value("${emailUsername}")
    private String emailUsername;
    @Value("${emailPassword}")
    private String emailPassword;
    @Value("${emailDelay}")
    private long emailDelay;


    public static void main(String[] args) {
    	ApplicationContext ctx = SpringApplication.run(BatchApp.class, args);
		BatchTask batchTask = (BatchTask) ctx.getBean("batchTask");
		batchTask.LaunchTasks();
	}

    
    @Bean
    public WsdlLocation configWsdl(){
    	WsdlLocation wsdlLocation = new WsdlLocation();
    	wsdlLocation.setWsdlLocationUsager(wsdlLocationUsager);
    	wsdlLocation.setWsdlLocationOuvrage(wsdlLocationOuvrage);
    	wsdlLocation.setWsdlLocationEdition(wsdlLocationEdition);
    	wsdlLocation.setWsdlLocationExemplaire(wsdlLocationExemplaire);
    	wsdlLocation.setWsdlLocationEmprunt(wsdlLocationEmprunt);
    	wsdlLocation.setWsdlLocationReservation(wsdlLocationReservation);
        return wsdlLocation;
    }

    @Bean
	public EmailConnexion configEmail(){
        EmailConnexion emailConnexion = new EmailConnexion();
        emailConnexion.setConnexionHost(emailHost);
        emailConnexion.setConnexionFrom(emailFrom);
        emailConnexion.setConnexionUsername(emailUsername);
        emailConnexion.setConnexionPassword(emailPassword);
        emailConnexion.setConnexionEmailDelay(emailDelay);
        return emailConnexion;
    }
}