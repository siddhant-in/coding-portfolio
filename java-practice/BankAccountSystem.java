class BankAccount {
    private double balance;

    BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount is: " + amount);
        } else {
            System.out.println("Invalid amount to be deposited...?");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount...!");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount bacc = new BankAccount();
        // bacc.deposit(520.25);
        // bacc.withdraw(600);
        System.out.println("Total Balance is: " + bacc.getBalance());
    }
}
