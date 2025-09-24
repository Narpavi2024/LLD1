package Create.BankAccount;
//It should have 3 data members
//accountNumber: String
//balance: int
//roi:double (Should represent rate of interest)
//It should have 2 methods
//getSimpleInterest: It should take time (in years) as a parameter. The data type of time should be int. It should return Simple Interest as a double.
//getBalanceWithInterest: It should take time (in years) as a parameter. The data type of time should be int. It should return a new balance (including simple interest) as a double.

public class BankMain {
    public static void main(String[] args) {
      BankAccount bankAccount = new BankAccount("Sabari1995",10000,5);
      int time = 2;
        System.out.println("Simple Interest is: "+bankAccount.getSimpleInterest(time));
        System.out.println("Balance with interest: "+bankAccount.getBalanceWithInterest(time));
    }
}
