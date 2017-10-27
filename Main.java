import java.util.Scanner;
public class Main
{
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);
    Circle c = new Circle();
    System.out.print("Input R ");
    double r = scan.nextDouble();
    c.setRadius(r);
    System.out.println("Radius = "+c.getRadius());
    System.out.println("Area = "+c.getArea());
    System.out.println("Perimetre = "+c.getPerimetre());
    System.out.println("Diametre = "+c.getDiametre());
    System.out.print("Input x ");
    double x = scan.nextDouble();
    System.out.print("Input y ");
    double y = scan.nextDouble();
    c.setXY(x,y);
    System.out.print("Input n ");
    int n = scan.nextInt();
    System.out.println("N Area = "+c.getNArea(n));
    System.out.println("Volume = "+c.getVolume());
  
  }
}