import java.util.Scanner;
 public class GCD {
   public static void main(String[] args) {
     Scanner scan =  new Scanner(System.in);
     System.out.print("Input Number :");
     int a = scan.nextInt();
     System.out.print("Input Number :");
     int b = scan.nextInt();
     int gcd = euclid(a,b);
     System.out.println(gcd);
   }
   public static int  GCD1(int a, int b) {
     int min;
     int max;
     if(a>=b) {
       min = b;
       max = a;
     }
     else {
       min = a;
       max = b;
     }
     int ans = 0;
     for(int i =1;i<=min;i++) {
       if((min%i==0)&&(max%i==0)) {
         ans=i;
       }
     }
     return ans;
   }
   public static int euclid (int a,int b) {
     int min;
     int max;
     if(a>=b) {
       min = b;
       max = a;
     }
     else {
       min = a;
       max = b;
     }
     if(max%min==0){
       return min;
     }
     else {
       int remainder = max%min;
       return euclid(min,remainder);
     }
   }
 }
