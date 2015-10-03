package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DecimalCollectionTest {
	private DecimalCollection dc;
	
	@Before
    public void before() {
		dc = new DecimalCollection();
        
		dc.add(3.0);
		dc.add(2.5);
		dc.add(1.3);
    }

	@Test
	public void testDecimalCollection() {
		assertEquals(3.0,2.5,1.3);
	}

	@Test
	public void testSize() {
		  assertEquals(3, dc.size()); 
	}

	@Test
	public void testSum() {
		assertEquals(6.8, dc.sum(),0);
	}

	@Test
	public void testHigher() {
		assertEquals(3.0, dc.higher(),0); 
	}
	
	@Test
    public void testAverage() {
        assertEquals(2.26666667, dc.average(), 10e-5);
    }

}
