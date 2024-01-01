package franxxcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class OutputStreamTest {

    @Test
    void writer() {
        try (OutputStream outputStream = Files.newOutputStream(Path.of("out.txt"))){
            for (int i = 0; i < 100; i++) {
                outputStream.write("Hello World\n".getBytes());
                outputStream.flush();
            } 
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
