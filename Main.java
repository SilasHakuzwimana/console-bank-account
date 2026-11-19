public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Silas", "123456789", 0.0, " RWF");
        account.deposit(5000);
        account.withdraw(200);
    }
}