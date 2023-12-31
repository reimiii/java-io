package franxxcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

public class PathTest {

    @Test
    void pathCreate() {

        Path file = Path.of("file");

        Assertions.assertEquals("file", file.toString());
        Assertions.assertFalse(file.isAbsolute());
    }

    @Test
    void usingFiles() {

        Path file = Path.of("pom.xml");

        Assertions.assertEquals("pom.xml", file.toString());
        Assertions.assertFalse(file.isAbsolute());
        Assertions.assertTrue(Files.exists(file));
    }
}
