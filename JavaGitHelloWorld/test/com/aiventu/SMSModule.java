package com.aiventu;

public class SMSModule {

	public String getVersion() {
		return "1.0";
	}	

	public void send(String message) {
		
		
		if ((message == null) || (message.trim().length() < 1)) {
			throw new IllegalArgumentException();
		}
		
	}

}
