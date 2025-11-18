package DesignPattern.Adapterpattern.thirdparty;

import DesignPattern.Adapterpattern.thirdparty.yesbank.YESBANK;

public class YESBankAdapter implements BankApi{

    private YESBANK yesbank = new YESBANK();
    @Override
    public void sendMoney(String from, String to, int amount) {
      yesbank.makePayment(to,from,amount);
    }

    @Override
    public void registeraccount(String accountnumber) {

    }

    @Override
    public long getbalance(String accountnumber) {
        return 0;
    }
}
