import java.util.Scanner;
public class primeNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int intput = scan.nextInt();
    // boolean a = prime(53);
    // System.out.println(a);
    boolean arr[] = sive(intput);
    for (int i=0;i<arr.length;i++) {
      System.out.print(i);
      if(arr[i]) {
        System.out.println(" is prime number");
      }
      else {
        System.out.println(" isn't prime number");
      }
    }
  }
  public static boolean prime (int n){
    for (int i=2;i<=Math.sqrt(n) ; i++) {
        if(n%i==0) {
          return false;
        }
    }
    return true;
  }
  public static boolean[] sive(int n) {
    boolean prime[] = new boolean[n];
    prime[2] = true;
    for (int i=3;i<prime.length;i++ ) {
      prime[i]= true;
      for(int j=2;j<i;j++) {
        if(i%j==0) {
          prime[i] = false;
          break;
        }
      }
    }
    return prime;
  }
}
