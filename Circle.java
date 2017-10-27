public class Circle
{
  final double PI = 3.14159265;
  double radius = 0;
  double xCoordinate = 0;
  double yCoordinate = 0;
  public void setRadius (double radius)
  {
    this.radius = radius;
  }
  public double getRadius ()
  {
    return radius;
  }
  public double getArea ()
  {
    return radius*radius*PI;
  }
  public double getPerimetre ()
  {
    return 2*radius*PI;
  }
  public double getDiametre ()
  {
    return 2*radius;
  }
  public void setXY(double x,double y)
  {
    yCoordinate = y;
    xCoordinate = x;
  }
  public double getNArea (int n)
  {
    return n*radius*radius*PI;
  }
  public double getVolume ()
  {
    return (4*radius*radius*radius*PI)/3;
  }
}
