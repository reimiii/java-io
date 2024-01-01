package franxxcode.io;

import org.junit.jupiter.api.Test;

import java.io.StringWriter;

public class MemoryStreamTest {

    @Test
    void memory() {

        StringWriter stringWriter = new StringWriter();

        for (int i = 0; i < 10; i++) {

            stringWriter.write("Hello string\n");
        }

        System.out.println(
                stringWriter.getBuffer().toString()
        );
    }
}
