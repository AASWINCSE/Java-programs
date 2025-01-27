class Bank {
    String name;

    public Bank(String name) {
        this.name = name;
    }
}

class Account {
    int accountNumber;
    double balance;
    Bank bank;

    public Account(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    void showDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
        System.out.println("Bank: " + bank.name);
    }

    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");
        Account account = new Account(12345, 1000, bank);
        account.showDetails();
    }
}
