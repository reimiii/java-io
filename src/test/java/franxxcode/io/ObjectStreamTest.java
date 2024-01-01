package franxxcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ObjectStreamTest {

    @Test
    void savePerson() {

        try (OutputStream outputStream = Files.newOutputStream(Path.of("mee.person"));
             ObjectOutputStream stream = new ObjectOutputStream(outputStream)) {

            stream.writeObject(new Person("002", "ZeroTwo"));
            stream.flush();

        } catch (IOException e) {
            Assertions.fail(e);
        }
    }

    @Test
    void getPerson() {

        try (InputStream inputStream = Files.newInputStream(Path.of("mee.person"));
             ObjectInputStream stream = new ObjectInputStream(inputStream)) {

            Person person = (Person) stream.readObject();

            Assertions.assertEquals("002", person.getId());
            Assertions.assertEquals("ZeroTwo", person.getName());

        } catch (IOException | ClassNotFoundException e) {
            Assertions.fail(e);
        }
    }
}
