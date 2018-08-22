import java.util.Scanner;

public class DDay {
  private String fullName ;

  public void setFullName (String fullName) {
    this.fullName = fullName;
  }

  public String getFullName () {
    return fullName;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    // FullName
    setFullName(input);
    System.out.println(getFullName());
  }
}
