
package org.MockitoProject.tests;

import java.util.List;
import java.util.LinkedList;

import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;

import org.junit.Test;
import org.junit.Ignore;


public class ArgumentMatchersTest {
	private static final Logger log = LogManager.getLogger(ExtremelyComplexTest.class);
	
	@Mock ImplementationServiceInterface implService;
	@InjectMocks Implementation impl = new Implementation();
	
	public ExtremelyComplexTest() {
	
	}
	
	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);		
	}
	
	@Ignore
	public void testEq() {	
		log.log(Level.DEBUG, "Testing mock list.");
		List mockedList = mock(List.class);
		impl.takeParameters("one", "three", "five");
		
		verify(implService.takeParameters(eq("one"), eq("two"), eq("three"));
	}
}