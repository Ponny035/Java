import java.util.*;;
import java.io.*;
public class TestStat  {
  public static void main(String[] args) throws IOException {
    BufferedReader file = new BufferedReader(new FileReader("/Users/patipol/Documents/GitHub/Java-Code/Stat-and-Dis.txt"));
    Scanner scan = new Scanner(System.in);
    String[] stat = new String[131];
    String[] dis = new String[131];
    double[] statCon = new double[131];
    double[] disCon = new double[131];
    for (int i=0; i<131; i++ ) {
      stat[i] = file.readLine();
      dis[i]= file.readLine();
    }
    file.close();
    double sum = 0;
    for (int i=0; i<131; i++ ) {
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
      switch (dis[i]) {
        case "A" :
          disCon[i] = 4;
          break;
        case "B+" :
          disCon[i] = 3.5;
          break;
        case "B" :
          disCon[i] = 3;
          break;
        case "C+" :
          disCon[i] = 2.5;
          break;
        case "C" :
          disCon[i] = 2;
          break;
        case "D+" :
          disCon[i] = 1.5;
          break;
        case "D" :
          disCon[i] = 1;
          break;
        default :
          disCon[i] = 0;
          break;
      }
      // 0.3038 x + 1.3429

      double ans = (statCon[i]*0.3038)+1.3429;
      if(disCon[i]==0) {
        sum+=0;
      }
      else {
        sum += Math.abs((disCon[i]-ans)/disCon[i]);
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
