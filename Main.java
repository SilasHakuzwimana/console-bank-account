import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Get client input
        try (Scanner scanner = new Scanner(System.in)) {
            // Get client input
            System.out.print("\nEnter your account owner name: ");
            String accountOwner = scanner.nextLine();
            System.out.print("Enter your account number: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Enter currency (RWF or USD): ");
            String currency = scanner.nextLine();
            System.out.print("Enter current exchange rate: ");
            double usdExhangeRateAmount = scanner.nextDouble();
            System.out.print("Enter your amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            System.out.print("Enter your amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            
            BankAccount account = new BankAccount(accountOwner, accountNumber, 0.0);
            account.deposit(depositAmount, currency, usdExhangeRateAmount);
            account.withdraw(withdrawAmount, currency, usdExhangeRateAmount);
        }
    }
}