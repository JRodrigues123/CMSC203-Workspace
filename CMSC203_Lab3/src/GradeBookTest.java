import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {

	private GradeBook gradeBook1 = new GradeBook(5);
	private GradeBook gradeBook2 = new GradeBook(5);
	
	@Before
	public void setUp() throws Exception {
		
		/*
		 * Adding scores for the first one
		 */
		gradeBook1.addScore(45);
		gradeBook1.addScore(70);
		
		/*
		 * Adding scores for the second one
		 */
		gradeBook2.addScore(98);
		gradeBook2.addScore(30);
		gradeBook2.addScore(69);
	}

	@After
	public void tearDown() throws Exception {
		
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	public void addScoreTest() {
		 /*
		  * A toString method to compare to the one from GradeBook
		  */
		assertTrue(gradeBook1.toString().equals("45.0 70.0 "));
		assertTrue(gradeBook2.toString().equals("98.0 30.0 69.0 "));
		
		/**
		 * Compares the score size
		 */
		assertEquals(2, gradeBook1.getScoreSize(), .001);
		assertEquals(3, gradeBook2.getScoreSize(), .001);
	}

	@Test
	public void testSum() {
		
		/*
		 * the sum of the scores
		 */
		assertEquals(115, gradeBook1.sum(), .0001);
		assertEquals(197, gradeBook2.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		
		/**
		 * Testing whether the minimum is true
		 */
		assertEquals(45, gradeBook1.minimum(), 0.001);
		assertEquals(30, gradeBook2.minimum(), 0.001);
	}

	@Test
	public void testFinalScore() {
		
		/*
		 * Testing the final score method
		 */
		assertEquals(70, gradeBook1.finalScore(), 0.001);
		assertEquals(167, gradeBook2.finalScore(), 0.001);
	}

	@Test
	public void testGetScoreSize() {
		
		/**
		 * Compares the score size
		 */
		assertEquals(2, gradeBook1.getScoreSize(), .001);
		assertEquals(3, gradeBook2.getScoreSize(), .001);
	}

	@Test
	public void testToString() {
		
		assertTrue(gradeBook1.toString().equals("45.0 70.0 "));
		assertTrue(gradeBook2.toString().equals("98.0 30.0 69.0 "));
	}

}
