
public class Displayer {
    public void displayDeposit(String currency, String accountOwner, double amount, double usdExhangeRateAmount,
            String accountNumber) {
        System.out.println("\n====================================");
        System.out.println("|| Console Bank Account - Deposit ||");
        System.out.println("====================================\n");
        System.out.println(
                "Account details: " + "\n\nAccount Owner: " + accountOwner + "\nAccount Number: " + accountNumber);
        System.out.println("\nCurrency: " + currency.toUpperCase());
        System.out.println("\nExchange Rate: " + usdExhangeRateAmount);
        if (currency.equalsIgnoreCase("USD")) {
            System.out.println(
                    "USD Amount converted: " + (amount / usdExhangeRateAmount) + " " + currency.toUpperCase());
        } else {
            System.out.println("No Conversion for RWF");
        }
        System.out.println("Deposited Amount: " + amount + " " + currency.toUpperCase());

        System.out.println("\n========================\n");
        System.out.println("Thank you for using our service!\n");
        System.out.println("The Console Bank Account Team");
        System.out.println("\n========================\n");

    }

    public void displayWithdrawal(String currency, String accountOwner, double amount, double balance, double usdExhangeRateAmount,
            String accountNumber) {
        System.out.println("\n=====================================");
        System.out.println("|| Console Bank Account - Withdrawal ||");
        System.out.println("=====================================\n");
        System.out.println(
                "Account details: " + "\n\nAccount Owner: " + accountOwner + "\nAccount Number: " + accountNumber);
        System.out.println("\nCurrency: " + currency.toUpperCase());
        System.out.println("\nExchange Rate: " + usdExhangeRateAmount);
        if (currency.equalsIgnoreCase("USD")) {
            System.out.println(
                    "USD Amount converted: " + (amount / usdExhangeRateAmount) + " " + currency.toUpperCase());
        } else {
            System.out.println("No Conversion for RWF");
        }
        System.out.println("\nAmount withdrawn: " + amount + " " + currency.toUpperCase());
        System.out.println("Remaining Balance: " + balance + " " + currency.toUpperCase());

        System.out.println("\n========================\n");
        System.out.println("Thank you for using our service!\n");
        System.out.println("The Console Bank Account Team");
        System.out.println("\n========================\n");
    }
}
