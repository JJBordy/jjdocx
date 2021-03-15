package jjbordy.jjdocx.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import jjbordy.jjdocx.JJDocx;
import jjbordy.jjdocx.data.impl.BasicData;
import jjbordy.jjdocx.data.impl.BasicDataElements;

public class TestBasicData {

	@Test
	public void TestInitializationGetSet() {

		final String valInline = "vInline";
		final List<String> valList = Arrays.asList(new String[] { "el1", "el2" });
		final List<String> valParagraphs = Arrays.asList(new String[] { "p1", "p2" });
		final List<List<String>> valTable = Arrays.asList(Arrays.asList("r1c1", "r1c2"), Arrays.asList("r2c1", "r2c2"));

		BasicDataElements elements = JJDocx.basicDataElements();
		elements.addInline("tagI", valInline);
		elements.addList("tagL", valList);
		elements.addParagraphs("tagP", valParagraphs);
		elements.addTable("tagT", valTable);

		JJDocxData data = JJDocx.basicData(elements);

		assertNotNull(data);
		assertTrue(data instanceof BasicData);

		assertEquals(valInline, data.getInline("tagI"));
		assertEquals(valList, data.getList("tagL"));
		assertEquals(valParagraphs, data.getParagraphs("tagP"));
		assertEquals(valTable, data.getTable("tagT"));

	}
}
