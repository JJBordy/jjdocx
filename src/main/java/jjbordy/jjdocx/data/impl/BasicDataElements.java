package jjbordy.jjdocx.data.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicDataElements {

	private Map<String, String> inlineValues;
	private Map<String, List<String>> lists;
	private Map<String, List<String>> paragraphs;
	private Map<String, List<List<String>>> tables;

	public BasicDataElements() {
		this.inlineValues = new HashMap<String, String>();
		this.paragraphs = new HashMap<String, List<String>>();
		this.lists = new HashMap<String, List<String>>();
		this.tables = new HashMap<String, List<List<String>>>();
	}

	protected Map<String, String> getAllInlines() {
		return this.inlineValues;
	}

	protected Map<String, List<String>> getAllLists() {
		return this.lists;
	}

	protected Map<String, List<String>> getAllParagraphs() {
		return this.paragraphs;
	}

	protected Map<String, List<List<String>>> getAllTables() {
		return this.tables;
	}

	public void addInline(String tag, String value) {
		this.inlineValues.put(tag, value);
	}

	public void addParagraphs(String tag, List<String> paragraphs) {
		this.paragraphs.put(tag, paragraphs);
	}

	public void addList(String tag, List<String> lists) {
		this.lists.put(tag, lists);
	}

	public void addTable(String tag, List<List<String>> table) {
		this.tables.put(tag, table);
	}

}
