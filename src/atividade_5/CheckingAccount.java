package atividade_5;

class CheckingAccount extends BankAccount {
    public CheckingAccount(int accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}
