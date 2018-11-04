import java.util.Scanner;
public class prime  {
  public static void main(String[] args) {
    Scanner scan =  new Scanner(System.in);
    int a = scan.nextInt();
    System.out.println(prime(a));
  }
  public static boolean prime(int n) {
    for (int i=2;i<n ;i++ ) {
      if ((n%i)==0) {
        return false;
      }
    }
    return true;
  }
  public static boolean prime2(int n) {
    for (int i=2;i<Math.sqrt(n) ;i++ ) {
      if ((n%i)==0) {
        return false;
      }
    }
    return true;
  }
  public static boolean[] sieve(int n) {
    boolean isNotprime[] = new boolean[n];
    int i=2;
    while(i<Math.sqrt(n)) {
      if(!isNotprime[i]) {
        int j = i*i;
        while(j<prime.length) {
          isNotprime[j]=true;
          j+=i;
        }
      }
      i++;
    }
    return isNotprime;
  }
}
