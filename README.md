## Console Bank Account

A simple Java console-based bank account application demonstrating object-oriented programming principles — encapsulation, immutability, and input validation.

## 📋 Overview

BankAccount models a basic bank account with:

Immutable identity fields — account owner, account number, and currency (set once at construction)
Mutable balance — updated through validated deposit and withdraw operations
Console receipts — each successful transaction prints a formatted summary

### ✨ Features

## Feature	Description

🔒 Encapsulation	All fields are private; access is controlled via getters and methods
🧱 Immutability	accountOwner, accountNumber, and currency are final
✅ Validation	Deposits require a positive amount; withdrawals require a positive amount and sufficient balance
🖨️ Receipts	Successful transactions print a formatted console receipt

## 🗂️ Class Structure

```bash
BankAccount
├── Fields
│   ├── accountOwner   : String  (final)
│   ├── accountNumber  : String  (final)
│   ├── currency       : String  (final)
│   └── balance        : double  (mutable)
│
├── Constructor
│   └── BankAccount(accountOwner, accountNumber, initialBalance, currency)
│
├── Getters
│   ├── getAcountOwner()
│   ├── getAccountNumber()
│   └── getBalance()
│
└── Operations
    ├── deposit(double amount)
    └── withdraw(double amount)
```
### 🚀 Getting Started

## Prerequisites

Java JDK 21 installed
A terminal or IDE (IntelliJ, Eclipse, VS Code)

## Compile

```bash
javac BankAccount.java
```

## Run (example usage)

Create a small Main.java to try it out:

```java
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(
            "Silas",
            "123456789",
            0.0,
            " RWF"
        );

        account.deposit(5000);
        account.withdraw(200);
    }
}
```
Then:

```bash
javac Main.java
java Main
```

### 📤 Example Output

## Deposit

```bash
====================================
|| Console Bank Account - Deposit ||
====================================

Account details: 

Account Owner: Silas
Account Number: 123456789

Deposited Amount: 5000.0 RWF

========================

Thank you for using our service!

The Console Bank Account Team

========================
```

## Withdrawal

```bash
====================================
|| Console Bank Account - Withdraw ||
====================================

Account details: 

Account Owner: Silas
Account Number: 123456789

Amount withdrawn: 200.0 RWF
Remaining Balance: 4800.0 RWF

========================

Thank you for using our service!

The Console Bank Account Team

========================
```

## ⚠️ Validation Rules

Operation	Rule	On Failure
deposit	amount > 0	Prints "Deposit amount must be positive."
withdraw	amount > 0 && amount <= balance	Prints "Invalid withdrawal amount."

## 🔮 Possible Improvements

Ideas for extending this project:

□ Fix typo: getAcountOwner() → getAccountOwner()
□ Add a transfer(BankAccount target, double amount) method
□ Add transaction history (List<Transaction>)
□ Use BigDecimal instead of double for currency precision
□ Add unit tests (JUnit)
□ Separate receipt printing from business logic (Single Responsibility Principle)
□ Support multiple currencies with conversion

## 🛠️ Tech Stack

Language: Java
Paradigm: Object-Oriented Programming
Interface: Console (CLI)

## 📄 License

This project is open source and available under the MIT License.

## 👥 Authors

The Console Bank Account Team

Thank you for using our service! 🏦