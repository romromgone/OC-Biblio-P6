package com.ocp4.webservice.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ocp4.webservice.dao.DaoFactory;


public abstract class AbstractService {
	private DaoFactory daoFactory;

	public AbstractService() {
		ApplicationContext context = new ClassPathXmlApplicationContext("webserviceContext.xml");
        this.daoFactory = (DaoFactory) context.getBean("daoFactory"); 
	}
	
    protected DaoFactory getDaoFactory() {
        return daoFactory;
    }

}
