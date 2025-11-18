package DesignPattern.Adapterpattern.thirdparty;

public class Phonepe {
    private static BankApi bankApi;
    public static void main(String[] args) {
        bankApi = new YESBankAdapter();
        bankApi.sendMoney("Sabari","Narpavi",500000);
    }
}
