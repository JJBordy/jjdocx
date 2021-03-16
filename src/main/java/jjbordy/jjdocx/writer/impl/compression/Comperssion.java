package jjbordy.jjdocx.writer.impl.compression;

import java.io.File;

public interface Comperssion {
	
	public void extract(File extractionFolder);
	
	public void compress(File folder);

}
