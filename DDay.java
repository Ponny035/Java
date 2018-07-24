import java.util.Scanner;

public class DDay {
  private static String fullName ;

  public static void setFullName (String fullName) {
    this.fullName = fullName;
  }

  public static String getFullName () {
    return fullName;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    setFullName(input);
    System.out.println(getFullName());
  }
}
