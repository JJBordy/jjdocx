package jjbordy.jjdocx.writer.compression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jjbordy.jjdocx.util.DeleteFolder;
import jjbordy.jjdocx.writer.JJDocxWriter;
import jjbordy.jjdocx.writer.impl.compression.BasicCompression;
import jjbordy.jjdocx.writer.impl.context.BasicWriterContext;
import jjbordy.jjdocx.writer.impl.operation.BasicOperationContext;

public class TestBasicCompression {

	private Path workingDir = Paths.get("src", "test", "resources", "workdir");
	private Path template = Paths.get("src", "test", "resources", "templates", "empty_template.docx");

	@Before
	public void createWorkDir() {
		clearWorkDir();
		try {
			Files.createDirectory(workingDir);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After
	public void clearWorkDir() {
		try {
			if (workingDir.toFile().exists()) {
				DeleteFolder.deleteFolder(workingDir);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testBasicCompression() {
		BasicWriterContext wContext = new BasicWriterContext(workingDir.toFile());
		BasicOperationContext opContext = new BasicOperationContext();
		opContext.setTemplate(template.toFile());

		BasicCompression compression = new BasicCompression(wContext, opContext);
		try {
			opContext = compression.extract();
			Path expectedArchivePath = Paths.get(workingDir.toFile().getAbsolutePath(), opContext.getOperationFolder(),
					JJDocxWriter.DOC_NAME + ".zip");
			assertEquals(expectedArchivePath.toString(), opContext.getArchivePath().toString());
		} catch (Exception e) {
			assertNull(e);
		}

		File archive = opContext.getArchivePath().toFile();

		assertTrue(archive.exists());

		
	}
}
