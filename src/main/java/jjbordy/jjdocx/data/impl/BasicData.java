package jjbordy.jjdocx.data.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import jjbordy.jjdocx.data.JJDocxData;

public class BasicData implements JJDocxData {

	private Map<String, String> inlineValues;
	private Map<String, List<String>> lists;
	private Map<String, List<String>> paragraphs;
	private Map<String, List<List<String>>> tables;

	public BasicData(BasicDataElements elements) {

		this.inlineValues = Collections.unmodifiableMap(elements.getAllInlines());
		this.lists = Collections.unmodifiableMap(elements.getAllLists());
		this.paragraphs = Collections.unmodifiableMap(elements.getAllParagraphs());
		this.tables = Collections.unmodifiableMap(elements.getAllTables());

	}

	public String getInline(String tag) {
		return this.inlineValues.get(tag);
	}

	public List<String> getList(String tag) {
		return this.lists.get(tag);
	}

	public List<String> getParagraphs(String tag) {
		return this.paragraphs.get(tag);
	}

	public List<List<String>> getTable(String tag) {
		return this.tables.get(tag);
	}
}
