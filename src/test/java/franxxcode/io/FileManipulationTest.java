package franxxcode.io;

import ch.qos.logback.classic.helpers.MDCInsertingServletFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManipulationTest {

    @Test
    void createAndDeleteFile() throws IOException {

        Path file = Files.createFile(Path.of("file"));

        Assertions.assertTrue(
                Files.exists(file)
        );

        Files.deleteIfExists(file);

        Assertions.assertFalse(
                Files.exists(file)
        );

    }

    @Test
    void createAndDeleteFolder() throws IOException {

        Path directory = Files.createDirectory(Path.of("some"));

        Assertions.assertTrue(Files.isDirectory(directory));
        Assertions.assertTrue(Files.exists(directory));

        Files.deleteIfExists(directory);
        Assertions.assertFalse(Files.exists(directory));
    }
}
