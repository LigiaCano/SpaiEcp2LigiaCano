package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FractionTest {
	private Fraction fr;
	
	 @Before
	    public void before() {
	        fr = new Fraction(1, 2);
	    }
	 
	@Test
	public void testFractionIntInt() {
		 assertEquals(1, fr.getNumerator());
	     assertEquals(2, fr.getDenominator());
	}

	@Test
	public void testFraction() {
		assertEquals(1,1);
	}

	@Test
	public void testGetNumerator() {
		assertEquals(1, fr.getNumerator());
	}

	@Test
	public void testGetDenominator() {
		assertEquals(2, fr.getDenominator());
	}
	
	@Test
	public void testIsPropia(){
		assertTrue(fr.isPropia());
	}
	
	@Test
	public void testIsImpropia(){
		assertFalse(!fr.isPropia());
	}

	@Test
	public void testDecimal() {
		assertEquals(0.5, fr.decimal(),10e-5);
	}
	
	@Test
	public void testIsGreater() {
	    assertEquals(true, fr.isGreater(new Fraction(1, 3)));
	}
	
	@Test
	public void testIsImproper(){
		assertFalse(fr.isImproper());
	}

}
