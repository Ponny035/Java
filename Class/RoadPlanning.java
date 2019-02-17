import java.util.Scanner;
public class RoadPlanning {

  private static Scanner scan =  new Scanner(System.in);
  private static double[] valley;

  public static void main(String[] args) throws NegativeArraySizeException {
    double[] postOffice = new double[2];
    try {
      setup();
    }
    catch (NegativeArraySizeException e) {
      System.out.println("Invalid value for valley.");
    }
    try {
      postOffice = findPlace();
      System.out.println("The location that minimize is valley "+ (int)(postOffice[0]) +" Maximun distance is "+ postOffice[1]+" Km.");
    }
    catch (NullPointerException e) {
      System.out.println("There is somthing error in program please run it again.");
    }
  }

  public static void setup() throws NegativeArraySizeException {
      System.out.print("How many house do valley in high way:  ");
      int n = scan.nextInt();
      if(n <= 0) {
        throw new NegativeArraySizeException ("Negative Array Size");
      }
      valley = new double[n];
    for (int i=0; i<valley.length-1; i++) {
      System.out.print("How many distance to get from valley " + (i+1) + " to valley " + (i+2) + " (Km): ");
      valley[i] = scan.nextInt();
    }
  }
  public static double[] findPlace() {
    double[] value = new double[2];
    if(valley.length != 1) {
      int min =0;
      int max =valley.length-1;
      int oldValue = 0;
      while(max-min > 1) {
        int mid = (min+max)/2;
        double firstHalf = 0;
        double secondHalf = 0;
        value[0] = min+1;
        for (int i=0; i<mid; i++) {
          firstHalf += valley[i];
        }
        for (int i=mid; i<valley.length; i++) {
          secondHalf += valley[i];
        }
        if(firstHalf > secondHalf) {
          max = mid;
          value[1] = firstHalf;
          //old
        }
        else {
          min = mid;
          value[1] = secondHalf;
        }
      }
      return value;
    }
    else {
      value[0] = 1;
      value[1] = valley[1];
      return value;
    }
  }

}
