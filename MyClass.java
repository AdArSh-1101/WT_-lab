import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class MyClass {
    public static void ProcessInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            try {
                throw new NegativeNumberException("Negative numbers are not allowed.");
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            }
        } else {
            double result = (double) num;
            System.out.println("The double value of " + num + " is " + result);
        }
    }

    public static void main(String[] args) {
        ProcessInput();
    }
}