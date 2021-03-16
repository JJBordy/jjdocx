package jjbordy.jjdocx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJJDocx {

	@Test
	public void hello() {
		assertEquals(new JJDocx().hello(), "test");
	}
}
