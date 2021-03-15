package jjbordy.jjdocx.datainfo;

import java.util.List;

public interface JJDocxDataInfo {

	List<JJDocxDataInfoElement> getAll();

	List<JJDocxDataInfoElement> getAllByType(JJDocxDataInfoType type);

	JJDocxDataInfoElement getByTag(JJDocxDataInfoType type, String tag);
}
