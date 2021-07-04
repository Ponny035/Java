public class SavingAccount extends Account
{
  double profit =0;
  public SavingAccount(String accountName, int accountNumber, String branch, double balance)
  {
    super( accountName, accountNumber, branch, balance);
  }
  public double profitMonth (double balance) {
       return balance * 0.025;
  }
  public void withdrawal(double outCome)
  {
    if(outCome<super.getBalance())
    {
      super.setBalance(super.getBalance() - outCome);
      System.out.println("withdrawal approve your blance is :"+ super.getBalance());
    }
  }
  public void sumProfit ( int month) {
    if(month==6) {
      super.setBalance(super.getBalance() + profit);
    }
    else {
      profit = profit + profitMonth(super.getBalance());
    }
  }
}
