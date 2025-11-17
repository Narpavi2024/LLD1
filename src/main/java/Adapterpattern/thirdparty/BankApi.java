package Adapterpattern.thirdparty;

public interface BankApi {
    void sendMoney(String from,String to,int amount);
    void registeraccount(String accountnumber);
    long getbalance(String accountnumber);
}
