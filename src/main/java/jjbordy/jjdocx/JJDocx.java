package jjbordy.jjdocx;

import java.io.File;

import jjbordy.jjdocx.data.JJDocxData;
import jjbordy.jjdocx.data.impl.BasicData;
import jjbordy.jjdocx.data.impl.BasicDataElements;
import jjbordy.jjdocx.writer.JJDocxWriter;
import jjbordy.jjdocx.writer.impl.BasicWriter;

public class JJDocx {
	public String hello() {
		return "test";
	}

	public static BasicDataElements basicDataElements() {
		return new BasicDataElements();
	}

	public static JJDocxData basicData(BasicDataElements elements) {
		return new BasicData(elements);
	}

	public static JJDocxWriter writer(File workingDirectory) {
		return new BasicWriter(workingDirectory);
	}
}
