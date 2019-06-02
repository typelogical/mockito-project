
package org.MockitoProject.tests;

import java.util.List;
import java.util.LinkedList;

import static org.mockito.Mockito.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;
import org.junit.Before;

import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockitoproject.*;
import org.mockitoproject.service.*;

public class ImplementationTest {
	private static final Logger log = LogManager.getLogger(ImplementationTest.class);
	
	@Mock ImplementationServiceInterface implService;
	@InjectMocks Implementation impl = new Implementation();
	
	public ImplementationTest() {
		
	}
	
	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetSomething() {	
		log.log(Level.DEBUG, "Testing getSomething.");
		Something mockSomething = new Something();
		String description = "This is a mock something.";
		mockSomething.setDescription(description);
		when(implService.getSomethingIDontYetHave())
			.thenReturn(mockSomething);
		String actualDescription = impl.getSomething().getDescription();
		log.log(Level.DEBUG, "actualDescription: " + actualDescription);
		log.log(Level.DEBUG, "expectedDescription: " + description);
		System.out.println("actualDescription: " + actualDescription);
		System.out.println("expectedDescription: " + description);
	
		Assert.assertEquals(impl.getSomething().getDescription()
			, mockSomething.getDescription());
	}
	
}