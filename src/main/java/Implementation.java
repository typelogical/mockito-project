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
	public String foot() {
		return "foot";	
	}
	
	public String bart() {
		return "bart";
	}
}