import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int number, power, total = 0;

        System.out.println("Enter number:");
        number = input.nextInt();
        System.out.println("Enter power");
        power = input.nextInt();
        total = number;

        for (int i = 1; i < power; i++) {
            total *= number;
        }

        System.out.println("Exponent of " + number + " is " + total);
    }
}
