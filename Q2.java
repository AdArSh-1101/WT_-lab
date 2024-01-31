import java.util.Scanner;

class LessBalanceException extends Exception {
    public LessBalanceException(String message) {
        super(message);
    }
}

class Account {
    int balance = 500;

    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " rupees deposited.");
    }

    void withdraw(int amount) throws LessBalanceException {
        if (balance - amount < 500) {
            throw new LessBalanceException("Withdraw amount is not valid.");
        } else {
            balance -= amount;
            System.out.println(amount + " rupees withdrawn.");
        }
    }

    void checkBalance() {
        System.out.println("Your balance is " + balance + " rupees.");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Account acc = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter deposit amount: ");
        int depositAmount = sc.nextInt();
        acc.deposit(depositAmount);

        System.out.println("Enter withdraw amount: ");
        int withdrawAmount = sc.nextInt();
        try {
            acc.withdraw(withdrawAmount);
        } catch (LessBalanceException e) {
            System.out.println(e.getMessage());
        }

        acc.checkBalance();
    }
}