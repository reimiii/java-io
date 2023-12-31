package franxxcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManipulationTest {

    @Test
    void createAndDelete() throws IOException {

        Path file = Files.createFile(Path.of("file"));

        Assertions.assertTrue(
                Files.exists(file)
        );

        Files.deleteIfExists(file);

        Assertions.assertFalse(
                Files.exists(file)
        );

    }
}
