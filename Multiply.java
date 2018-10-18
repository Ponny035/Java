import static java.lang.Math.max;
import java.util.Scanner;

public class Multiply {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
   String num1;
   String num2;
   System.out.print("Input your first number : ");
   num1= scan.next();
   System.out.print("Input your Second number : ");
   num2 = scan.next();
   String ans = multiply(num1, num2);
   System.out.println(ans);
    twoN("1234567","5");

  }

  public static String multiply(String num1, String num2) {
    if((num1.length() == 1 )||num2.length() == 1) {
      return (Integer.parseInt(num1)*Integer.parseInt(num2))+"";
    }
    String a1 = num1.substring(0,num1.length()/2);
    String a2 = num1.substring(num1.length()/2);
    String b1 = num2.substring(0,num2.length()/2);
    String b2 = num2.substring(0,num2.length()/2);
    String c2 = multiply(a1,b1);
    String c0 = multiply(a2,b2);
    String c11 = multiply(Integer.parseInt(a1)+Integer.parseInt(a2)+"",Integer.parseInt(b1)+Integer.parseInt(b2)+"");
    String c1 = (Integer.parseInt(c11) - (Integer.parseInt(c2)+Integer.parseInt(c0))) +"";
    String c = Integer.parseInt(concat(c2,num1.length()))+Integer.parseInt(concat(c1,num1.length()/2))+Integer.parseInt(c0)+"";
    return c;
  }
  public static String concat(String a, int zero) {
    for (int i=0;i<zero;i++) {
      a += "0";
    }
    return a;
  }
  public static String twoN(String a, String b) {
      if(a.length()<b.length()) {
          for(int i=a.length();i<b.length();i++) {
              a = "0"+a;
          }
      }
      if(a.length()>b.length()) {
          for(int i=b.length();i<a.length();i++) {
              b = "0"+b;
          }
      }
      //System.out.println(a+" "+b+" "+a.length()+" "+Math.log(a.length())+" "+Math.ceil((Math.log(a.length()))/(Math.log10(2))));
      int length = (int)Math.floor((Math.log(a.length()))/(Math.log(2)));
      for(int i=0;i<length;i++) {
          a = "0"+a;
          b = "0"+b;
      }
      System.out.println(a+" "+b+" "+length+" "+ (Math.log10(a.length()))/(Math.log10(2)));
      return "";
  }
}
