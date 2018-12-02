import java.util.Scanner;
public class RusMul {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Input your first number: ");
    int n = scan.nextInt();
    System.out.print("Input your second number: ");
    int m = scan.nextInt();
    int ans = multiply(n,m);
    System.out.println("Ans is " +ans);
  }

  public static int multiply (int n,int m) {
    if (n%2 == 0) { //even number
      return multiply(n/2,m*2);
    }
    else if (n != 1) { //odd numner
      return multiply((n-1)/2,m*2)+m;
    }
    else { // base case n =1
      return m;
    }
  }
}
