import java.util.Scanner;
public class Main {
  int month = 0;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    SavingAccount myAccount = new SavingAccount("Patipol Saechan", 12345656, "KMUTT", 100000000);
    myAccount.deposit(scan.nextInt());
    System.out.printf("%.2f\n",myAccount.getBalance());
  }

}
