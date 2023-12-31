package franxxcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SmollFileTest {

    @Test
    void writeSmollFile() throws IOException {
        Path smol1 = Files.write(Path.of("smol1"), "HelloWorld".getBytes());
        Assertions.assertTrue(Files.exists(smol1));

        Path path = Files.writeString(Path.of("smol2"), "Hello String");
        Assertions.assertTrue(Files.exists(path));
    }
}
