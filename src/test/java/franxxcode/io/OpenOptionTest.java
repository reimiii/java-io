package franxxcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class OpenOptionTest {

    @Test
    void append() {

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(
                Path.of("append.txt"),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        )) {

            bufferedWriter.write("Hello append\n");
            bufferedWriter.flush();

        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
