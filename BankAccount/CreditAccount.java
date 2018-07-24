public class CreditAccount extends Account
{
  public CreditAccount(String accountName, int accountNumber, String branch, double balance)
  {
    super( accountName, accountNumber, branch, balance);
  }
  public void withdrawal(double outCome)
  {
      super.setBalance(super.getBalance() - outCome);
      System.out.println("withdrawal approve your blance is :"+ super.getBalance());
  }
}