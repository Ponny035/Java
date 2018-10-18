import java.util.Scanner;
import java.util.Arrays;
public class primeNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int intput = scan.nextInt();
    //intput = 10000000;
    // boolean a = prime(53);
    // System.out.println(a);
    // long startTime = System.nanoTime();
     boolean arr[] = sieve(intput+1);

    //boolean arr[] = primeCheck(intput+1);
    //long enddingTime = System.nanoTime() - startTime;
    // System.out.println( enddingTime/1000000 + " ms" );

    // startTime = System.nanoTime();

     boolean arr2[] = primeCheck(intput+1);

    //enddingTime = System.nanoTime() - startTime;
    //System.out.println( (enddingTime/1000000000) + " s" );
    for (int i=2;i<arr.length;i++) {
      if(!arr[i]) {
        System.out.print(i);
        System.out.println(" is prime number");
      }
    }

  }
  public static boolean[] primeCheck (int n){
    boolean prime[] = new boolean[n];
    for(int i=2;i<prime.length ; i++){
      prime[i]=prime(i);
    }
    return prime;
  }
  public static boolean prime (int n){
    //System.out.println(n);
    for (int i=2;i<Math.floor(Math.sqrt(n)) ; i++) {
        if(n%i==0) {
          return false;
        }
    }
    return true;
  }
  public static boolean[] sieve(int n) {
    boolean prime[] = new boolean[n];
    //Arrays.fill(prime, Boolean.TRUE);
    int i=2;
    while(i<Math.sqrt(n)) {
      if(!prime[i]) {
        int j = i*i;
        System.out.println(j);
        while(j<prime.length) {
          prime[j]=true;
          j+=i;
        }
      }
      i++;
    }
    return prime;
  }
}
