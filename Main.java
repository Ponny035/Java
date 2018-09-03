import java.util.Scanner;
public class Main {
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);
    Linklist link = new Linklist<Integer>();
    link.add(10);
    link.add(100);
    link.add(1000);
    link.add(10000);
    System.out.println("add ");
    for (int i=0; i<4 ;i++) {
      System.out.println(link.get(i));
    }
    link.add(2, 2);
    System.out.println("add between");
    for (int i=0; i<5 ;i++) {
      System.out.println(link.get(i));
    }
    link.set(2, 500);
    System.out.println("set value at 2");
    for (int i=0; i<5 ;i++) {
      System.out.println(link.get(i));
    }
    link.remove(2);
    System.out.println("remove 2");
    for (int i=0; i<4 ;i++) {
      System.out.println(link.get(i));
    }
    link.remove();
    System.out.println("remove");
    for (int i=0; i<3 ;i++) {
      System.out.println(link.get(i));
    }
  }
}
