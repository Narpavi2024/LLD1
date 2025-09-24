package Create.BankAccount;

//Create a new java file BankAccount.java and define a simple  BankAccountclass represents a bankAccount.
//Add two Fields: balance(double) and ownerName(String).
//Add deposit and withdraw method with basic validation eg:(ensuring withdrawal dont see the negative balances).

public class BankAccount {
    String accountNumber;
    int balance;
    double roi;
    String ownername;


    public  BankAccount(String accountNumber,int balance,double roi,String ownername){
        this.accountNumber = accountNumber;
        if(balance >=0) {
            this.balance = balance;
        }else{
            this.balance = 0; // avoid negative starting balance
        }
        this.roi = roi;
        this.ownername = ownername;
    }

    public double getSimpleInterest(int time){
     return (balance * time * roi) / 100;
    }

    public double getBalanceWithInterest(int time){
        return balance + getSimpleInterest(time);
    }

   public void deposit(int  amount){
        if (amount >0){
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        }else{
            System.out.println("Deposit amount must be positive.");
        }
   }

   public void withdraw(int amount){
        if(amount <= 0){
            System.out.println("Withdrawal amount must be positive.");
        }else if(amount > balance){
            System.out.println("Insufficient funds. Withdrawal denied.");
        }else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        }
   }

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getRoi() {
        return roi;
    }

    public String getOwnername() {
        return ownername;
    }
}
