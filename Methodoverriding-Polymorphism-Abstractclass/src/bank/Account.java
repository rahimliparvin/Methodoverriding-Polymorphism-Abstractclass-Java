package bank;

public class Account {

    public String name;
    public double balance;

    public Account(String name) {
        this.name = name;

    }

    public void deposit(double balance) {
        this.balance += balance;
        System.out.println("Deposited " + this.balance);
    }

    public void withdraw(double amount) {

        if(amount <= balance) {
            this.balance -= amount;
            System.out.println("Withdrawn " + this.balance);
        }else{
            System.out.println("Insufficent balance  ");
            return;
        }
    }

    public double balance() {
        return this.balance;
    }

    public void displayBalance() {
        System.out.println("Balance : " + this.balance);
    }



}
