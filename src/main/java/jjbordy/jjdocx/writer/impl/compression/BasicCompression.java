package jjbordy.jjdocx.writer.impl.compression;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import jjbordy.jjdocx.writer.JJDocxWriter;
import jjbordy.jjdocx.writer.impl.context.BasicWriterContext;
import jjbordy.jjdocx.writer.impl.operation.BasicOperationContext;

public class BasicCompression {

	private BasicOperationContext opContext;
	private BasicWriterContext wContext;

	public BasicCompression(BasicWriterContext context, BasicOperationContext opContext) {
		this.wContext = context;
		this.opContext = opContext;
	}

	public BasicOperationContext extract() throws Exception {

		Path workingFolder = Paths.get(this.wContext.getWorkingFolderPath(), this.opContext.getOperationFolder());

		workingFolder.toFile().mkdir();

		Path destinationDoc = Paths.get(workingFolder.toString(), JJDocxWriter.DOC_NAME + ".zip");

		Files.copy(Paths.get(this.opContext.getTemplate().getAbsolutePath()), destinationDoc.toAbsolutePath());

		opContext.setArchivePath(destinationDoc);

		// https://www.baeldung.com/java-compress-and-uncompress

		return this.opContext;
	}
}
