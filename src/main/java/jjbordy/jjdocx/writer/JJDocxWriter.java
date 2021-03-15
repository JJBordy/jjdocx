package jjbordy.jjdocx.writer;

import java.io.FileWriter;

import jjbordy.jjdocx.data.JJDocxData;

public interface JJDocxWriter {

	FileWriter write(FileWriter template, JJDocxData data);

}
