package jjbordy.jjdocx.writer.impl.operation;

import java.io.File;
import java.nio.file.Path;
import java.util.UUID;

public class BasicOperationContext {

	private File template;
	private String operationFolder;
	private Path archivePath;

	public BasicOperationContext() {
		this.operationFolder = UUID.randomUUID().toString();
	}

	public String getOperationFolder() {
		return operationFolder;
	}

	public Path getArchivePath() {
		return archivePath;
	}

	public void setArchivePath(Path archivePath) {
		this.archivePath = archivePath;
	}

	public File getTemplate() {
		return template;
	}

	public void setTemplate(File template) {
		this.template = template;
	}

}
