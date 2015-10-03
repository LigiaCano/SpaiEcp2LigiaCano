package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class UserTest {
	 private User usr;

	    @Before
	    public void before() {
	        usr = new User(29, "Ligia", "Cano");
	    }

	@Test
	public void testUser() {
		  assertEquals(29, usr.getNumber());
		  assertEquals("Ligia", usr.getName()); 
		  assertEquals("Cano", usr.getFamilyName());
	}

	@Test
	public void testGetNumber() {
		assertEquals(29, usr.getNumber());
	}

	@Test
	public void testGetName() {
		assertEquals("Ligia", usr.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Cano", usr.getFamilyName());
	}

	@Test
	public void testFullName() {
		 assertEquals("Ligia Cano", usr.fullName());
	}

	@Test
	public void testInitials() {
		 assertEquals("L.", usr.initials());
	}

}
