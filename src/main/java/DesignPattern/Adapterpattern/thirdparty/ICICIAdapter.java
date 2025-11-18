package DesignPattern.Adapterpattern.thirdparty;

import DesignPattern.Adapterpattern.thirdparty.ICICIBank.IciciBank;

public class ICICIAdapter implements BankApi{
    private IciciBank iciciBank = new IciciBank();
    @Override
    public void sendMoney(String from, String to, int amount) {
     iciciBank.makePayment(to,from,amount);
    }

    @Override
    public void registeraccount(String accountnumber) {

    }

    @Override
    public long getbalance(String accountnumber) {
        return 0;
    }
}
