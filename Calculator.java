import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // take two numbers and perform calculations on them.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers to add");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // System.out.println("The numbers are: " + num1 + " and " + num2 );
        int result = num1 + num2;
        System.out.println("Your total is " + result);

        scanner.close();
    }
}
    