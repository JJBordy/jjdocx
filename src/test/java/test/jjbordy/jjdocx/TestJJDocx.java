package test.jjbordy.jjdocx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jjbordy.jjdocx.JJDocx;

public class TestJJDocx {

	@Test
	public void hello() {
		assertEquals(new JJDocx().hello(), "hello");
	}
}
