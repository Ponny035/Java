import java.util.Scanner;
public class DayOfWeek  {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int cases = scan.nextInt();
    for (int q=1;q<=cases;q++ ) {
      int day = scan.nextInt();
      switch (day) {
        case 1 :
          System.out.println("Case #"+q+": Monday");
          break;
        case 2 :
          System.out.println("Case #"+q+": Tuesday");
          break;
        case 3 :
          System.out.println("Case #"+q+": Wednesday");
          break;
        case 4 :
          System.out.println("Case #"+q+": Thursday");
          break;
        case 5 :
          System.out.println("Case #"+q+": Friday");
          break;
        case 6 :
          System.out.println("Case #"+q+": Saturday");
          break;
        case 0 :
          System.out.println("Case #"+q+": Sunday");
          break;
        default:
          System.out.println("Case #"+q+": Not valid");
          break;
      }
    }
  }
}
