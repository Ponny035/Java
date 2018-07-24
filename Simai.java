import java.util.Scanner;
public class Simai {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(cal3(scan.nextInt(), scan.nextInt()));

  }
  public static int cal (int n) {
    if(n>1) {
      return cal(n-1)+n;
    }
    else {
      return 1;
    }
  }
  public static int cal2 (int a, int n) {
    if(n>1) {
      return cal2(a, n-1)+a;
    }
    else {
      return a;
    }
  }
  public static int cal3 (int a, int n) {
    if(n>1) {
      return cal2(a, n-1)*2;
    }
    else {
      return 1;
    }
  }
}
