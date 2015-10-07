package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
	private Point pt;
	private Point pt2;

	@Before
	public void before() {
		pt = new Point(2, 5);
	}

	@Test
	public void testPointIntInt() {
		assertEquals(2, pt.getX());
		assertEquals(5, pt.getY());
	}

	@Test
	public void setPointIntInt() {
		pt.setX(1);
		pt.setY(3);
		assertEquals(1, pt.getX());
		assertEquals(3, pt.getY());
	}

	@Test
	public void testPointInt() {
		pt = new Point();
		assertEquals(0, pt.getX());
		assertEquals(0, pt.getY());
	}

	@Test
	public void testPoint() {
		assertEquals(0, 0);
	}

	@Test
	public void testGetX() {
		assertEquals(2, pt.getX());
	}

	@Test
	public void testGetY() {
		assertEquals(5, pt.getY());
	}

	@Test
	public void testModule() {
		assertEquals(5.3851, pt.module(), 0.1);
	}

	@Test
	public void testTranslateOrigin() {
		this.pt.translateOrigin(new Point(1, 1));
		assertEquals(1, pt.getX());
		assertEquals(4, pt.getY());
	}

	@Test
	public void testSum() {
		pt2 = new Point(3, 9);
		assertEquals(5, pt.sum(pt2).getX());
		assertEquals(14, this.pt.getY());
	}

	@Test
	public void testToString() {
		assertEquals("Point[2,5]", pt.toString());
	}

}
