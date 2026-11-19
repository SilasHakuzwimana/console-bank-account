public class BankAccount {
    private final String accountOwner;
    private final String accountNumber;
    private final String currency;
    private double balance;

    public BankAccount(String accountOwner, String accountNumber, double initialBalance, String currency) {
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.currency = currency;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\n====================================");
            System.out.println("|| Console Bank Account - Deposit ||");
            System.out.println("====================================\n");
            System.out.println(
                    "Account details: " + "\n\nAccount Owner: " + accountOwner + "\nAccount Number: " + accountNumber);
            System.out.println("\nDeposited Amount: " + amount + currency);

            System.out.println("\n========================\n");
            System.out.println("Thank you for using our service!\n");
            System.out.println("The Console Bank Account Team");
            System.out.println("\n========================\n");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\n====================================");
            System.out.println("|| Console Bank Account - Withdraw ||");
            System.out.println("====================================\n");
            System.out.println(
                    "Account details: " + "\n\nAccount Owner: " + accountOwner + "\nAccount Number: " + accountNumber);
            System.out.println("\nAmount withdrawn: " + amount + currency);
            System.out.println("Remaining Balance: " + balance + currency);

            System.out.println("\n========================\n");
            System.out.println("Thank you for using our service!\n");
            System.out.println("The Console Bank Account Team");
            System.out.println("\n========================\n");

        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}