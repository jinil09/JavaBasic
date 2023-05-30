class AccountHolder {
    String name;
    int accountNumber;

    public AccountHolder(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

}


public class ArrAYobj {
    public static void main(String[] args) {
        AccountHolder[] accountHolders = new AccountHolder[3]; 

        accountHolders[0] = new AccountHolder("Harsh", 1234);
        accountHolders[1] = new AccountHolder("Karan", 5678);
        accountHolders[2] = new AccountHolder("Jay", 9012);

        for (AccountHolder accountHolder : accountHolders) {
            System.out.println("Name: " + accountHolder.name);
            System.out.println("Account Number: " + accountHolder.accountNumber);
            System.out.println();
        }
    }
}
