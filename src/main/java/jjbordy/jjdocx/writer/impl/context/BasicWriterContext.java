package jjbordy.jjdocx.writer.impl.context;

import java.io.File;

public class BasicWriterContext {

	private File workingFolder;

	public BasicWriterContext(File workingFolder) {
		this.workingFolder = workingFolder;
	}

	public String getWorkingFolderPath() {
		return workingFolder.getAbsolutePath();
	}

	public void validate() throws Exception {

		if (workingFolder == null) {
			throw new Exception("workingFolder is not set in Context");
		}

		if (!workingFolder.exists() || !workingFolder.canRead() || !workingFolder.canWrite()) {
			throw new Exception(workingFolder.getAbsolutePath() + " doesn't exist or is not readable/writable");
		}

	}
}
