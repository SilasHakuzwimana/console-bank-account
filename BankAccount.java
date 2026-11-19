public class BankAccount {
    private final String accountOwner;
    private final String accountNumber;
    private double balance;
    private final double usdExchangeAmount = 1478.92;

    public BankAccount(String accountOwner, String accountNumber, double initialBalance) {
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double convertToRWF(double usdAmount) {
        return usdAmount * usdExchangeAmount;
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

    public void deposit(double amount, String currency) {
        if (currency.equalsIgnoreCase("USD")) {
            amount = convertToRWF(amount);
        }

        // Keep Rwandan Francs
        currency = "RWF";

        if (amount > 0) {
            balance += amount;
            System.out.println("\n====================================");
            System.out.println("|| Console Bank Account - Deposit ||");
            System.out.println("====================================\n");
            System.out.println(
                    "Account details: " + "\n\nAccount Owner: " + accountOwner + "\nAccount Number: " + accountNumber);
            System.out.println("\nDeposited Amount: " + amount + " " + currency);

            System.out.println("\n========================\n");
            System.out.println("Thank you for using our service!\n");
            System.out.println("The Console Bank Account Team");
            System.out.println("\n========================\n");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount, String currency) {
        if (currency.equalsIgnoreCase("USD")) {
            amount = convertToRWF(amount);
        }

        // Keep Rwandan Francs
        currency = "RWF";

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\n====================================");
            System.out.println("|| Console Bank Account - Withdraw ||");
            System.out.println("====================================\n");
            System.out.println(
                    "Account details: " + "\n\nAccount Owner: " + accountOwner + "\nAccount Number: " + accountNumber);
            System.out.println("\nAmount withdrawn: " + amount + " " + currency);
            System.out.println("Remaining Balance: " + balance + " " + currency);

            System.out.println("\n========================\n");
            System.out.println("Thank you for using our service!\n");
            System.out.println("The Console Bank Account Team");
            System.out.println("\n========================\n");

        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}