import java.util.Scanner;

public class Change {
  public static void main(String[] args) {
    double bill;
    double pay;
    Scanner scan = new Scanner(System.in);
    System.out.print("Total : ");
    bill = scan.nextDouble();
    System.out.print("Pay : ");
    pay = scan.nextDouble();
    pay = checkFund(pay, bill);
    System.out.println(pay);
  }
  public static double checkFund(double amount, double bill) {
    Scanner scan = new Scanner(System.in);
    while((amount-bill)<0) {
      double temp = 0;
      System.out.printf("Insufficient funds you need %.2f more Baht: ", bill-amount);
      temp = scan.nextDouble();
      amount += temp;
    }
    return amount;
  }
  public static void change(double amount) {
    int k;
    int fiveH;
    int oneH;
    int fifty;
    int twenty;
    int ten;
    int five;
    int two;
    int one;
    int pointFive;
    int pointTwoFive;
    while(amount>=1000) {
      amount -= 1000;
      k++;
    }
    while(amount>=500) {
      amount -= 500;
      fiveH++;
    }
    while(amount>=100) {
      amount -= 100;
      oneH++;
    }
    while(amount>=50) {
      amount -= 50;
      fifty++;
    }
    while(amount>=20) {
      amount -= 20;
      twenty++;
    }
    while(amount>=10) {
      amount -= 10;
      ten++;
    }
    while(amount>=5) {
      amount -= 5;
      five++;
    }
    while(amount>=2) {
      amount -= 2;
      two++;
    }
    while(amount>=1) {
      amount -= 1;
      one++;
    }
    while(amount>=0.5) {
      amount -= 0.5;
      pointFive++;
    }
    while(amount>=0.25) {
      amount -= 0.25;
      pointTwoFive ++;
    }

  }
}
