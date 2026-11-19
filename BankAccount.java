public class BankAccount {
    // Bring in displayer class
    Displayer display = new Displayer();

    private final String accountOwner;
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountOwner, String accountNumber, double initialBalance) {
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double convertToRWF(double usdAmount, double usdExhangeRateAmount) {
        return usdAmount * usdExhangeRateAmount;
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

    public void deposit(double amount, String currency, double usdExhangeRateAmount) {
        if (currency.equalsIgnoreCase("USD")) {
            amount = convertToRWF(amount, usdExhangeRateAmount);
        }

        // Keep Rwandan Francs
        // currency = "RWF";

        if (amount > 0) {
            balance += amount;
            display.displayDeposit(currency, accountOwner,
                    amount, usdExhangeRateAmount, accountNumber);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount, String currency, double usdExhangeRateAmount) {
        if (currency.equalsIgnoreCase("USD")) {
            amount = convertToRWF(amount, usdExhangeRateAmount);
        }

        // Keep Rwandan Francs
        // currency = "RWF";

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            display.displayWithdrawal(currency, accountOwner,
                    amount, balance, usdExhangeRateAmount, accountNumber);

        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}