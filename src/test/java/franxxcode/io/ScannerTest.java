package franxxcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ScannerTest {

    @Test
    void scanner() {

        try (InputStream inputStream = Files.newInputStream(Path.of("print.txt"));
             Scanner scanner = new Scanner(inputStream)) {

            while (scanner.hasNextLine()) {
                System.out.println(
                        scanner.nextLine()
                );
            }
        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
