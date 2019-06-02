package org.mockitoproject;

import org.mockitoproject.service.*;

public class Implementation {
	private ImplementationServiceInterface implService;
	
	public Implementation() {
		implService = new ImplementationServiceImplementation();
	}
	
	public Something getSomething() {
		Something something = implService.getSomethingIDontYetHave();
		return something;		
	}
	
	public takeParameters(String param1, String param2, String param3) {
		implService.takeParameters(param1, param2, param3);	
	}
	public String foot() {
		return "foot";	
	}
	
	public String bart() {
		return "bart";
	}
}