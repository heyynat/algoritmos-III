package atividade_5;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12345, 1000.0, "John Doe", 0.03);
        CheckingAccount checkingAccount = new CheckingAccount(54321, 500.0, "Jane Smith");

        System.out.println("Savings Account Owner: " + savingsAccount.getOwnerName());
        System.out.println("Initial Balance: $" + savingsAccount.getBalance());
        double interest = savingsAccount.calculateInterest();
        System.out.println("Calculated Interest: $" + interest);
        savingsAccount.setBalance(savingsAccount.getBalance() + interest);
        System.out.println("Updated Balance after interest: $" + savingsAccount.getBalance());

        System.out.println("\nChecking Account Owner: " + checkingAccount.getOwnerName());
        System.out.println("Initial Balance: $" + checkingAccount.getBalance());
        checkingAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal: $" + checkingAccount.getBalance());
    }
}
