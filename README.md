# 🏦 Mini EthSwitch ATM Network

### Console-Based Interbank ATM Transaction System

---

# 📌 Project Overview

ATMswitch Network is a Java-based console application inspired by the real-world Ethiopian interbank switching system, EthSwitch.

The project simulates how users can access their bank accounts from different bank ATMs through a shared switch system.

### Example Scenario

A customer has a Commercial Bank account but there is no Commercial Bank ATM nearby.
Instead, the customer uses an Abyssinia Bank ATM.

The ATM:

1. Sends the request to the ATM system
2. ATMswitch routes the request to the correct bank account
3. The bank account validates the withdrawal rules
4. The transaction is approved or rejected

This project demonstrates real-world banking transaction flow using Object-Oriented Programming principles.

---

# 🚀 Features

✅ Withdraw money from different bank ATMs
✅ Interbank transaction routing using EthSwitch
✅ Multiple ATM types with different withdrawal fees
✅ Minimum balance protection rule
✅ Withdrawal validation system
✅ Console-based interactive banking simulation
✅ Runtime transaction messages and status updates

---

# 🏦 Banking Rules Implemented

## 💰 Minimum Balance Rule

Accounts are not allowed to go below the minimum balance limit after withdrawal.

### Example

If the minimum balance is:

```text
100 birr
```

and the account has:

```text
500 birr
```

The user cannot withdraw:

```text
450 birr
```

because the remaining balance would become:

```text
50 birr
```

which violates the minimum balance rule.

---

## 💸 ATM Transaction Fee System

Different ATM types may charge different withdrawal fees.

### Example

* CBE ATM → 10 birr fee
* Abyssinia ATM → 15 birr fee

The system automatically adds the fee to the withdrawal calculation before approving the transaction.

---

# 🧠 OOP Concepts Used

This project demonstrates the following OOP concepts:

---

## ✔ Classes and Objects

The system models real-world banking entities using classes such as:

* Account
* ATM
* ATMswitch
* Bank

Objects are created to simulate real transactions.

---

## ✔ Encapsulation

Sensitive account data such as balance is protected using private access modifiers.

### Example

```java
private double balance;
```

The balance cannot be modified directly outside the class.
It can only be changed safely through methods like:

* withdraw()
* deposit()

---

## ✔ Constructors

Constructors are used to initialize account and ATM objects when they are created.

### Example

```java
Account acc1 = new Account(...);
```

---

## ✔ Inheritance

Inheritance is used to create specialized account and ATM types.

### Example

```java
class SavingsAccount extends Account
```

```java
class CBEBankATM extends ATM
```

This allows subclasses to reuse common fields and methods from parent classes.

---

## ✔ Method Overloading

The withdraw method is overloaded to support different transaction types.

### Example

```java
withdraw(double amount)
withdraw(double amount, double fee)
```

---

## ✔ Method Overriding

Subclasses override methods from parent classes to customize ATM or account behavior.

### Example

Different ATM types may apply different fees or transaction messages.

---

## ✔ Polymorphism

Superclass references are used to interact with different ATM/account subclasses dynamically.

### Example

```java
ATM atm = new CBEBankATM();
```

This allows the system to treat multiple ATM types uniformly.

---

## ✔ Access Modifiers

The project uses:

* private
* protected
* public

to control access and protect sensitive data.

---

## ✔ Packages

The project is organized into packages for better structure and readability.

---

# 🔄 ATMswitch System Flow

```text
ATM → ATMswitch → Bank Account
```

### Transaction Process

1. User enters withdrawal amount
2. ATM sends request to EthSwitch
3. ATMswitch routes request to correct account
4. Account checks:

   * sufficient balance
   * minimum balance rule
   * transaction fee
5. Transaction is approved or rejected
6. ATM displays final result

---

# 📂 Project Structure

```text
src/
│
├── model/
│   ├── Account.java
│   ├── SavingsAccount.java
│   ├── BusinessAccount.java
│   └── Bank.java
│
├── service/
│   ├── ATM.java
│   ├── CBEBankATM.java
│   ├── AbyssiniaBankATM.java
│   └── ATMswitch.java
│
└── app/
    └── Main.java
```

---

# ▶️ How to Compile

```bash
javac src/model/*.java src/service/*.java src/app/Main.java
```

---

# ▶️ How to Run

```bash
java -cp src app.Main
```

---

# 🔮 Possible Future Improvements

* PIN authentication
* Transaction history
* Deposit feature
* Money transfer between accounts
* GUI interface
* Database integration

---

# 👨‍💻 Authors

* [ABDI BEZU]
* [AMEN ENDRIYAS]
