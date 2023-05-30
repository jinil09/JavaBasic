
import java.util.*;


class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 1000) {
            System.out.println("Initial balance must be at least 1000");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (balance - amount < 1000) {
            System.out.println("Insufficient funds. Minimum balance of 1000 required.");
        }
        balance -= amount;
    }
}

public class Account1{
    public static void main(String[] args) {
        Account myAccount = new Account(10000); 
        myAccount.withdraw(7000); 
        double newBalance = myAccount.getBalance();

        if(newBalance >= 1000)
        {
           System.out.println(newBalance);
        }
    }
}