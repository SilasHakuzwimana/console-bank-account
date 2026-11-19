## Console Bank Account (USD <-> RWF)

A simple Java console-based bank account application demonstrating object-oriented programming principles — encapsulation, immutability, and input validation — with **interactive user input** and **USD → RWF currency conversion**.

## 📋 Overview

`BankAccount` models a basic bank account with:

- **Immutable identity fields** — account owner and account number (set once at construction)
- **Mutable balance** — always stored in **RWF** (Rwandan Francs)
- **Automatic currency conversion** — USD deposits/withdrawals are converted to RWF
- **Console receipts** — each successful transaction prints a formatted summary

### ✨ Features

## Feature Description

| Feature                | Description                                                                                          |
| ---------------------- | ---------------------------------------------------------------------------------------------------- |
| 🔒 Encapsulation       | All fields are `private`; access controlled via getters and methods                                  |
| 🧱 Immutability        | `accountOwner` and `accountNumber` are `final`                                                       |
| 💱 Currency Conversion | USD amounts are converted to RWF using a fixed exchange rate                                         |
| ⌨️ Interactive Input   | `Main` prompts the user for all account details via `Scanner`                                        |
| ✅ Validation          | Deposits require a positive amount; withdrawals require a positive amount **and** sufficient balance |
| 🖨️ Receipts            | Successful transactions print a formatted console receipt                                            |

## 🗂️ Class Structure

```bash
BankAccount
├── Fields
│ ├── accountOwner : String (final)
│ ├── accountNumber : String (final)
│ ├── balance : double (mutable, in RWF)
│ └── usdExchangeAmount : double (final = 1478.92)
│
├── Constructor
│ └── BankAccount(accountOwner, accountNumber, initialBalance)
│
├── Getters
│ ├── getAccountOwner()
│ ├── getAccountNumber()
│ └── getBalance()
│
└── Operations
├── convertToRWF(double usdAmount)
├── deposit(double amount, String currency)
└── withdraw(double amount, String currency)
```

### 🚀 Getting Started

## Prerequisites

- **Java JDK 21+** installed
- A terminal or IDE (IntelliJ, Eclipse, VS Code)

## Compile

```bash
javac BankAccount.java Main.java
```

## Run

```bash
java Main
```

## Example Interaction

```bash
Enter your account owner name: Silas
Enter your account number: ACC-64775
Enter your currency: USD
Enter your amount to deposit: 5
Enter your amount to withdraw: 2
```

### 💱 Currency Conversion

All balances are stored internally in **RWF**. When a transaction is made in **USD**, it is converted using:

```bash
1 USD = 1478.92 RWF
```

Input Currency Behavior
**USD** (case-insensitive) Converted to RWF before applying
Any other value Treated as RWF (no conversion)

## 📤 Example Output

Deposit (USD input, converted to RWF)

```bash
====================================
|| Console Bank Account - Deposit ||
====================================

Account details:

Account Owner: Silas
Account Number: ACC-376467

Deposited Amount: 7394.6 RWF

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
Account Number: ACC-376467

Amount withdrawn: 2957.84 RWF
Remaining Balance: 4436.76 RWF

========================

Thank you for using our service!

The Console Bank Account Team

========================
```

## ⚠️ Validation Rules

Operation Rule On Failure
deposit amount > 0 (after conversion) Prints "Deposit amount must be positive."
withdraw amount > 0 && amount <= balance Prints "Invalid withdrawal amount."

## 🔮 Possible Improvements

☑ Fix typo: getAcountOwner() → getAccountOwner()
☑ Support USD → RWF conversion
□ Make exchange rate configurable (not hardcoded)
□ Add a transfer(BankAccount target, double amount) method
□ Add transaction history (List<Transaction>)
□ Use BigDecimal instead of double for currency precision
□ Add unit tests (JUnit)
□ Separate receipt printing from business logic (Single Responsibility Principle)
□ Support multiple currencies beyond USD
□ Add trailing newline to Main.java

## 🛠️ Tech Stack

Language: Java (JDK 21)
Paradigm: Object-Oriented Programming
Interface: Console (CLI)
Input: java.util.Scanner

## 📄 License

This project is open source and available under the MIT License.

## 👥 Authors

The Console Bank Account Team

Thank you for using our service! 🏦
