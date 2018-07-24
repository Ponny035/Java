import java.util.*;;
import java.io.*;
public class TestStat2  {
  public static void main(String[] args) throws IOException {
    BufferedReader file = new BufferedReader(new FileReader("/Users/patipol/Documents/GitHub/Java-Code/Stat-and-Cal1.txt"));
    Scanner scan = new Scanner(System.in);
    String[] stat = new String[131];
    String[] calI = new String[131];
    double[] statCon = new double[131];
    double[] calICon = new double[131];
    for (int i=0; i<122; i++ ) {
      stat[i] = file.readLine();
      calI[i]= file.readLine();
    }
    file.close();
    double sum = 0;
    for (int i=0; i<122; i++ ) {
      switch (stat[i]) {
        case "A" :
          statCon[i] = 8;
          break;
        case "B+" :
          statCon[i] = 7;
          break;
        case "B" :
          statCon[i] = 6;
          break;
        case "C+" :
          statCon[i] = 5;
          break;
        case "C" :
          statCon[i] = 4;
          break;
        case "D+" :
          statCon[i] = 3;
          break;
        case "D" :
          statCon[i] = 2;
          break;
        default :
          statCon[i] = 1;
          break;
      }
      switch (calI[i]) {
        case "A" :
          calICon[i] = 4;
          break;
        case "B+" :
          calICon[i] = 3.5;
          break;
        case "B" :
          calICon[i] = 3;
          break;
        case "C+" :
          calICon[i] = 2.5;
          break;
        case "C" :
          calICon[i] = 2;
          break;
        case "D+" :
          calICon[i] = 1.5;
          break;
        case "D" :
          calICon[i] = 1;
          break;
        default :
          calICon[i] = 0;
          break;
      }
      //0.2787 x + 0.9796
      double ans = (statCon[i]*0.2787)+0.9796;
      if(calICon[i]==0) {
        sum+=0;
      }
      else {
        sum += Math.abs((calICon[i]-ans)/calICon[i]);
      }
    }
    System.out.printf("Mean absolute percentage error = %.2f percent \n",(sum*100)/131);
  }

}

// import java.util.*;
//
// public class TestStat  {
//     public static void main(String[] args) {
//       Scanner scan = new Scanner(System.in);
//       for (double y = 1;y<=4;y+=0.5 ) {
//         //double x = (y-1.4457)/0.3185;
//         double x = (y-0.8739)/0.3786;
//         System.out.println(y+ " "+(x-1)+"-"+(x+1));
//       }
//     }
// }
