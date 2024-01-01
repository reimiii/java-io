package franxxcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReaderTest {

    @Test
    void readPerChar() {

        try (BufferedReader reader = Files.newBufferedReader(Path.of("out.txt"))) {

            StringBuilder builder = new StringBuilder();
            int charcter;
            int counter = 0;

            while ((charcter = reader.read()) != -1) {
                builder.append((char) charcter);
                counter += 1;
            }

            System.out.println(builder);
            System.out.println(counter);

        } catch (IOException e) {
            Assertions.fail(e);
        }
    }

    @Test
    void readAllChars() {

        try (BufferedReader reader = Files.newBufferedReader(Path.of("out.txt"))) {

            StringBuilder builder = new StringBuilder();
            char[] chars = new char[1024];
            int length;
            int counter = 0;

            while ((length = reader.read(chars)) != -1) {
                builder.append(chars, 0, length);
                counter += 1;
            }

            System.out.println(builder);
            System.out.println(counter);

        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
