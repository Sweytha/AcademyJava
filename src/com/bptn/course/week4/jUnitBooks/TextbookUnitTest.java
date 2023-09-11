package com.bptn.course.week4.jUnitBooks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TextbookUnitTest {
	
	//first test case to check the getTitle() method
	@Test
	public void testGetTitle() {
		 Textbook tb = new Textbook("Computer Science", 14.99, 9);
		 
		 //assertEquals checks if the expected and actual result are the same
		 assertEquals("Computer Science", tb.getTitle());
		
	}
	
	//second test case to check the getEdition() method
	@Test
	public void testGetEdition() {
		
		 Textbook tb = new Textbook("Computer Science", 14.99, 9);
		 assertEquals(9, tb.getEdition());
		
	}
	
	//third test case to check the getBookInfo() method
	@Test
	public void testBookInfo() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		assertEquals("Computer Science-14.99-9", tb.getBookInfo());
		
	}
	
	@Test
	public void testCanSubstituteFor_canSubstitute() {
		 Textbook tb = new Textbook("Computer Science", 14.99, 9);
		 Textbook tb2 = new Textbook("Computer Science", 19.99, 2);
		 
		 assertEquals(true, tb.canSubstituteFor(tb2));
		
		 //this also works
		 //assertTrue(tb.canSubstituteFor(tb2));
		
	}
	
	@Test
	public void testCanSubstituteFor_cannotSubstitute() {
		
		 Textbook tb = new Textbook("Computer Science", 14.99, 9);
	     Textbook tb2 = new Textbook("Basketweaving", 19.99, 2);
	     
	     assertEquals(false, tb.canSubstituteFor(tb2));
	     
	     //this also works
	    //assertFalse(tb.canSubstituteFor(tb2));
		
	}


}
