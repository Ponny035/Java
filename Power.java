import java.util.Scanner;
public class Power {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(cal(scan.nextInt(),scan.nextInt()));
  }
  public static int cal(int base, int pow ) {
    if(pow>0) {
      return cal(base,pow-1)*base;
    }
    else {
      return 1;
    }
  }
}
