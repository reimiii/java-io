package franxxcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriterTest {

    @Test
    void write() {

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of("write.txt"))) {

            for (int i = 0; i < 100; i++) {
                bufferedWriter.write("Hello buffer\n");
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
