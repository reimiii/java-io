package franxxcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrintStreamTest {

    @Test
    void console() {

        PrintStream printStream = System.out;

        printStream.println("Hii");
        printStream.println("Hii");
        printStream.println("Hii");
    }

    @Test
    void printStream() {

        try (OutputStream outputStream = Files.newOutputStream(Path.of("print.txt"));
             PrintStream printStream = new PrintStream(outputStream)) {

            printStream.println("Hii print");
            printStream.println("Hii print");
            printStream.println("Hii print");
            printStream.println("Hii print");

        } catch (IOException e) {
            Assertions.fail(e);
        }
    }
}
