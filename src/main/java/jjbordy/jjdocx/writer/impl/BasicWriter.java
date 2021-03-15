package jjbordy.jjdocx.writer.impl;

import java.io.File;
import java.io.FileWriter;

import jjbordy.jjdocx.data.JJDocxData;
import jjbordy.jjdocx.writer.JJDocxWriter;

public class BasicWriter implements JJDocxWriter {

	private File workingDirectory;

	public BasicWriter(File workingDirectory) {
		this.workingDirectory = workingDirectory;
	}

	public FileWriter write(FileWriter template, JJDocxData data) {
		// TODO Auto-generated method stub
		return null;
	}

}
