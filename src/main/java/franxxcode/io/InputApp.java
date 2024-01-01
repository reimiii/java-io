package franxxcode.io;

import java.util.Scanner;

public class InputApp {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Add Name: ");
            String name = scanner.nextLine();

            System.out.println(
                    "Hello " + name
            );
        }
    }
}
