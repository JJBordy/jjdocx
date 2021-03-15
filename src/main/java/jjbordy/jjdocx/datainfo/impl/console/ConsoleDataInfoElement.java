package jjbordy.jjdocx.datainfo.impl.console;

import java.util.Arrays;
import java.util.List;

import jjbordy.jjdocx.datainfo.JJDocxDataInfoElement;
import jjbordy.jjdocx.datainfo.JJDocxDataInfoType;

public class ConsoleDataInfoElement implements JJDocxDataInfoElement {

	private JJDocxDataInfoType type;
	private String tag;
	private String name;
	private List<String> description;

	public ConsoleDataInfoElement(JJDocxDataInfoType type) {
		this.type = type;
	}

	public ConsoleDataInfoElement withTag(String tag) {
		this.tag = tag;
		return this;
	}

	public ConsoleDataInfoElement withName(String name) {
		this.name = name;
		return this;
	}

	public ConsoleDataInfoElement withDescription(List<String> description) {
		this.description = description;
		return this;
	}

	public JJDocxDataInfoType getType() {
		return this.type;
	}

	public String getTag() {
		return this.tag;
	}

	public String getName() {
		return this.name;
	}

	public List<String> getDescription() {
		return this.description;
	}

	@Override
	public String toString() {
		return "[" + this.type.name() + "] - '" + this.name + "' : "
				+ Arrays.toString(this.description.toArray(new String[0]));
	}

}
