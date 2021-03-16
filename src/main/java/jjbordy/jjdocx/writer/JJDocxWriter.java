package jjbordy.jjdocx.writer;

import java.io.FileWriter;

import jjbordy.jjdocx.data.JJDocxData;

public interface JJDocxWriter {

	public static final String DOC_NAME = "d";

	FileWriter write(FileWriter template, JJDocxData data);

}
