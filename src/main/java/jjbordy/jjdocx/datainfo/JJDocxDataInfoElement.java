package jjbordy.jjdocx.datainfo;

import java.util.List;

public interface JJDocxDataInfoElement {
	JJDocxDataInfoType getType();

	String getTag();

	String getName();

	List<String> getDescription();
}
