import java.util.*;
public class model {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double count = 0;
        for (int i=1; i<=15; i++ ) {
          double x1 = scan.nextDouble();
          double x2 = scan.nextDouble();
          double real  =  scan.nextDouble();
          double result = 1.08910*x2 - 0.08084*x1 - 0.08038;
          double error = real-result;
          System.out.printf("case %d = %.2f\t deta yt - rc = %.2f\n", i,result,(real-result));
          if(Math.abs(error)>0.85) {
            count++;
          }
        }
        System.out.println("error "+((count/15)*100)+"%");
    }
}
