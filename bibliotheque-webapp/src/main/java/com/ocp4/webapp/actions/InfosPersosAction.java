package com.ocp4.webapp.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import generated.clientserviceUsager.Usager;


public class InfosPersosAction extends ActionSupport implements SessionAware {
	private Usager usager;
	private Map<String, Object> session;

	public Usager getUsager() {
		return usager;
	}
	
	@Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }
	
    public String doInfos() {          
        usager = (Usager) session.get("usager");
        if (usager == null) {
        	this.addActionError("Vous avez été déconnecté");
        	return ActionSupport.ERROR;
        }
        else return ActionSupport.SUCCESS;
    }

}
