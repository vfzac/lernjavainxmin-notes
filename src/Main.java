// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            //user input
            Scanner scanner = new Scanner(System.in);

            //console output
            System.out.print("Hello and welcome!");

            System.out.println("Integer: " + 10 +
                               " Double: " + 3.14 +
                               " Boolean: " + true);

            // Use System.out.printf() for easy formatted printing.
            System.out.printf("pi = %.5f", Math.PI); // => pi = 3.14159

            // read string input = scanner.next();
            // read byte input = scanner.nextByte();
            // read int input = scanner.nextInt();
            // read long input = scanner.nextLong();
            // read float input = scanner.nextFloat();
            // read double input = scanner.nextDouble();
            // read boolean input = scanner.nextBoolean();

        System.out.print("\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}