
package org.MockitoProject.tests;

import java.util.List;
import java.util.LinkedList;

import static org.mockito.Mockito.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;

import org.junit.Test;
import org.junit.Ignore;


public class ExtremelyComplexTest {
	private static final Logger log = LogManager.getLogger(ExtremelyComplexTest.class);
	public ExtremelyComplexTest() {
	
	}
	
	@Ignore
	public void testMockList() {	
		log.log(Level.DEBUG, "Testing mock list.");
		List mockedList = mock(List.class);
		
		mockedList.add("one");
		mockedList.clear();
		
		verify(mockedList).add("one");
		verify(mockedList).clear();	
	}
	
	//@Test
	public void testMockListWithNonExistentElement() {	
		log.log(Level.DEBUG, "Testing mock list with nonexistent element.");
		List mockedList = mock(List.class);
		
		mockedList.add("one");
		mockedList.clear();
		//try {
		verify(mockedList).add("two");
		//} catch(
	}
	@Test
	public void testLinkedList() {
	
		LinkedList mockedList = mock(LinkedList.class);
		
		when(mockedList.get(0)).thenReturn("first");
		when(mockedList.get(1)).thenThrow(new RuntimeException());
		
		System.out.println(mockedList.get(0));
		try {
			System.out.println(mockedList.get(1));
		} catch (RuntimeException e) {
			// test should throw
		}
		
		System.out.println(mockedList.get(999));
		
		verify(mockedList).get(0);
	}
}