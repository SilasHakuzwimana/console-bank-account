## Console Bank Account (USD <-> RWF)

A simple Java console-based bank account application demonstrating object-oriented programming principles — encapsulation, immutability, separation of concerns, and input validation — with **interactive user input**, **user-defined USD → RWF currency conversion**, and **formatted console receipts**.

## 📋 Overview

`BankAccount` models a basic bank account with:

- **Immutable identity fields** — account owner and account number (set once at construction)
- **Mutable balance** — always stored in **RWF** (Rwandan Francs)
- **User-defined currency conversion** — the USD → RWF rate is entered at runtime
- **Console receipts** — formatted transaction summaries, handled by a dedicated `Displayer` class

### ✨ Features

## Feature Description

| Feature                   | Description                                                                                          |
| ------------------------- | ---------------------------------------------------------------------------------------------------- | --- |
| 🔒 Encapsulation          | All fields are `private`; access controlled via getters and methods                                  |
| 🧱 Immutability           | `accountOwner` and `accountNumber` are `final`                                                       |
| 💱 Dynamic Conversion     | USD amounts converted to RWF using a **user-supplied exchange rate**                                 |
| ⌨️ Interactive Input      | `Main` prompts for account details, currency, rate, and amounts via `Scanner`                        |
| 🖨️ Separation of Concerns | Receipt printing lives in `Displayer`, not `BankAccount` (SRP)                                       |
| ✅ Validation             | Deposits require a positive amount; withdrawals require a positive amount **and** sufficient balance |
| 📄 Receipts               | Successful transactions print a formatted console receipt                                            |     |

## 🗂️ Class Structure

```bash
console_bank/
├── BankAccount.java # Core account logic (fields, deposit, withdraw, conversion)
├── Displayer.java # Receipt formatting and console output
├── Main.java # Entry point — interactive Scanner prompts
├── LICENSE
└── README.md
```

```bash
BankAccount
├── Fields
│ ├── accountOwner : String (final)
│ ├── accountNumber : String (final)
│ └── balance : double (mutable, always in RWF)
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
├── convertToRWF(double usdAmount, double usdExchangeRateAmount)
├── deposit(double amount, String currency, double usdExchangeRateAmount)
└── withdraw(double amount, String currency, double usdExchangeRateAmount)
```

### `Displayer`

Handles all receipt formatting:

- `displayDeposit(currency, accountOwner, amount, usdExchangeRateAmount, accountNumber)`
- `displayWithdrawal(currency, accountOwner, amount, balance, usdExchangeRateAmount, accountNumber)`

### `Main`

Runs the interactive flow:

1. Ask for owner name
2. Ask for account number
3. Ask for currency (`RWF` or `USD`)
4. Ask for the current exchange rate
5. Ask for deposit amount
6. Ask for withdrawal amount
7. Create the account, deposit, withdraw, and print receipts

---

## 🚀 Getting Started

### Prerequisites

- **Java JDK 21+** installed
- A terminal or IDE (IntelliJ, Eclipse, VS Code)

### Compile

```bash
javac BankAccount.java Displayer.java Main.java
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
Enter your account number: ACC-45673
Enter currency (RWF or USD): usd
Enter current exchange rate: 200
Enter your amount to deposit: 200
Enter your amount to withdraw: 50
```

### 💱 Currency Conversion

All balances are stored internally in RWF. When a transaction is made in USD, it's converted using the rate the user provides at runtime:

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
```bash
deposit amount > 0 (after conversion) Prints "Deposit amount must be positive."
withdraw amount > 0 && amount <= balance Prints "Invalid withdrawal amount."
```

## 🔮 Possible Improvements

```bash
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
```

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
