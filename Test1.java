import java.util.Scanner;
public class Test1 
{ 
  public static void main (String[] args) 
  { 
    Scanner scan = new Scanner(System.in);
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    double fa= 8-(4.5*(a-Math.sin(a)));
    double fb= 8-(4.5*(b-Math.sin(b)));
    double xs=0;
    double tall=0;
    double fxs=0;
    if(fa*fb<0)
    {
      while(true)
      {
        xs=(a+b)/2;
        fxs=8-(4.5*(xs-Math.sin(xs)));
        tall=(b-a)/2;
        //System.out.println("tall="+tall);
        if(Math.abs(tall)<0.0001)
        {
          break;
        }
        else
        {
          if(fa*fxs>0)
          {
            fa=8-(4.5*(xs-Math.sin(xs)));
            a=xs;
          }
          else
          {
            fb=8-(4.5*(xs-Math.sin(xs)));
            b=xs;
          }
        }
      }
      System.out.println("xs = "+xs);
    }
  }
}