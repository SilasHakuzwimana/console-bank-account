import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get client input
        System.out.print("\nEnter your account owner name: ");
        String accountOwner = scanner.nextLine();
        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter your currency: ");
        String currency = scanner.nextLine();
        System.out.print("Enter your amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        System.out.print("Enter your amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();

        BankAccount account = new BankAccount(accountOwner, accountNumber, 0.0);
        account.deposit(depositAmount, currency);
        account.withdraw(withdrawAmount, currency);

        scanner.close();
    }
}