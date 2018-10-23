import java.util.Scanner;
public class MyPermutation {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Input you number : ");
    int n = scan.nextInt();
    Permutation myList = new Permutation(n);
    String ans = myList.getList();
    System.out.println(ans);
  }
}
