import java.util.Scanner;
public class rus {
  public static void main(String[] args) {
    Scanner scan =  new Scanner(System.in);
    System.out.print("Input Number :");
    int a = scan.nextInt();
    System.out.print("Input Number :");
    int b = scan.nextInt();
    System.out.println("ans =" +Multiplication(a,b));
  }
  public static int Multiplication(int n, int m) {
    if (n%2 == 0) {
      if (n==0) {
        return 0;
      }
      System.out.println("Even n="+(n/2)+" m="+(m*2));
      return Multiplication(n/2,m*2);
    }
    else {
      if (n>1) {
        System.out.println("Odd n="+((n-1)/2)+" m="+(m*2));
        return m+Multiplication((n-1)/2,m*2);
      }
      else {
        System.out.println("m="+m);
        return m;
      }
    }
  }
}
