package com.ocp4.batch.beans;


public class EmailConnexion {
	private String connexionHost;
    private String connexionFrom;
    private String connexionUsername;
    private String connexionPassword;
    private long connexionEmailDelay;
    
    
	public String getConnexionHost() {
		return connexionHost;
	}
	public void setConnexionHost(String connexionHost) {
		this.connexionHost = connexionHost;
	}
	
	public String getConnexionFrom() {
		return connexionFrom;
	}
	public void setConnexionFrom(String connexionFrom) {
		this.connexionFrom = connexionFrom;
	}
	
	public String getConnexionUsername() {
		return connexionUsername;
	}
	public void setConnexionUsername(String connexionUsername) {
		this.connexionUsername = connexionUsername;
	}
	
	public String getConnexionPassword() {
		return connexionPassword;
	}
	public void setConnexionPassword(String connexionPassword) {
		this.connexionPassword = connexionPassword;
	}
	
	public long getConnexionEmailDelay() {
		return connexionEmailDelay;
	}
	public void setConnexionEmailDelay(long connexionEmailDelay) {
		this.connexionEmailDelay = connexionEmailDelay;
	}
}