import java.util.Scanner;
public class div34 {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    int cases = scan.nextInt();
    for(int i=1;i<=cases;i++) {
      int num = scan.nextInt();
      int count = 0;
      for( int j=0;j<num;j++); {
        int check = scan.nextInt()+1;
        if((check%3==0)&&(check%4==0)) {
          count++;
        }
        else if(check%4==0) {
          count++;
        }
        else if(check%3==0) {
          count++;
        }
      }
      System.out.println("Case #"+i+" :"+count);
    }
  }
}
