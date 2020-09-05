package local.djsantos;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void shouldCreateFileInTemporaryFolder() throws IOException {
        File file = tempFolder.newFile("teste.txt");

        assertTrue(file.isFile());
        assertEquals(tempFolder.getRoot(), file.getParentFile());
    }

}
