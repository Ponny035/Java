import java.util.Scanner;
public class Main 
{
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    Fibo fibo = new Fibo();
    int[] fibos = new int[n];
    fibos = fibo.FiboCal(n);
    Main.printOut(fibos,n); 
  }

  static void printOut(int[] arr,int n)
  {
    for(int i=0; i<n; i++)
    {
      System.out.printf("%d ",arr[i]);
    } 
    System.out.printf("\n");
  }
}
