package org.mockitoproject.service;

import org.mockitoproject.Something;

public class ImplementationServiceImplementation
implements ImplementationServiceInterface {
	public Something getSomethingIDontYetHave() {
		Something something = new Something();
		return something;
	}
	
}