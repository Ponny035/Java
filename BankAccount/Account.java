public class Account
{
  private String accountName;
  private int accountNumber;
  private String branch;
  private double balance;
  public Account (String accountName, int accountNumber, String branch, double balance)
  {
    this.accountName = accountName;
    this.accountNumber = accountNumber;
    this.branch = branch;
    this.balance = balance;
  }
  public void setAccountName(String accountName)
  {
    this.accountName = accountName;
  }
  public void setAccountNumber(int accountNumber)
  {
    this.accountNumber = accountNumber;
  }
  public void setBranch(String branch)
  {
    this.branch = branch;
  }
  public void setBalance(double balance)
  {
    this.balance = balance;
  }
  public String getAccountName()
  {
    return accountName;
  }
  public int getAccountNumber()
  {
    return accountNumber;
  }
  public double getBalance()
  {
    return balance;
  }
  public String branch()
  {
    return branch;
  }
  public void deposit (double inCome)
  {
    this.balance = this.balance + inCome;
    System.out.printf("deposit approve your blance is : %.2f",getBalance());
  }
}
