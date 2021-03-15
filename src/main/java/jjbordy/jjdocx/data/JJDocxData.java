package jjbordy.jjdocx.data;

import java.util.List;

public interface JJDocxData {

	String getInline(String tag);

	List<String> getParagraphs(String tag);

	List<String> getList(String tag);

	List<List<String>> getTable(String tag);
}
