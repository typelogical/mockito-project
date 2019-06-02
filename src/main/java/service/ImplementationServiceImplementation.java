package org.mockitoproject.service;

import org.mockitoproject.Something;

public class ImplementationServiceImplementation
implements ImplementationServiceInterface, TakeParamInterface {
	public Something getSomethingIDontYetHave() {
		Something something = new Something();
		return something;
	}
	
	public Something takeParameter(String description) {
		Something something = new Something();
		something.setDescription(description);
	}
	public void takeParameters(String param1, String param2, String param3) {
		// don't do anything with strs
	}
	
}