package Create.BankAccount;

public class BankAccount {
    String accountNumber;
    int balance;
    double roi;

    public  BankAccount(String accountNumber,int balance,double roi){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.roi = roi;
    }

    public double getSimpleInterest(int time){
     return (balance * time * roi) / 100;
    }

    public double getBalanceWithInterest(int time){
        return balance + getSimpleInterest(time);
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
}
