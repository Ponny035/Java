import java.util.*;;
import java.io.*;
public class Dictionary  {
  public static void main(String[] args) throws IOException {
    BufferedReader file = new BufferedReader(new FileReader("/Users/ponny/Documents/GitHub/Java-Code/longdo_en_th.txt"));
    Scanner scan = new Scanner(System.in);
    String[][] words = new String[1343][3];
    for (int i=0; i<1343; i++ ) {
      words[i][0] = file.readLine();
      words[i][1] = file.readLine();
      words[i][2] = file.readLine();
    }
    file.close();
    while (true) {
      boolean isFound = false;
      int max = 1342;
      int min = 0;
      int count = 0;
      System.out.print("Please enter an English word: ");
      String word = scan.nextLine();
      //Tetranary+Binary Search
      //in this case Big-O = O(log(1343)base5)  = O(5)
      //Big-O = log(n) time
      while(!isFound) {
        int mid2 = (min+max)/2;
        int mid1 = (min+mid2)/2;
        int mid3 = (mid2+max)/2;
        int check = 0;
        if(word.compareToIgnoreCase(words[mid1][0])<0){
          max =mid1-1;
        }
        else if (word.compareToIgnoreCase(words[mid3][0])>0) {
          min = mid3+1;
        }
        else if(word.compareToIgnoreCase(words[mid2][0])<0){
          min = mid1+1;
          max = mid2-1;
        }
        else if(word.compareToIgnoreCase(words[mid3][0])<0){
          min = mid2+1;
          max = mid3-1;
        }
        mid2 = (max+min)/2;
        if(word.compareToIgnoreCase(words[mid2][0])<0) {
          max = mid2-1;
        }
        else if(word.compareToIgnoreCase(words[mid2][0])>0) {
          min = mid2+1;
        }
        //Exception case
        switch (word) {
          case "à la carte" :
            mid2 = 1;
            break;
          case "a la carte" :
            mid2 = 2;
            break;
          case "a load of" :
            mid2 = 3;
            break;
          case "déjà vu" :
            mid2 = 323;
            break;
        }
        if (word.compareToIgnoreCase(words[mid2][0])==0) {
          System.out.println("Word type: "+words[mid2][1]);
          System.out.println("Thai translation: "+words[mid2][2]);
          isFound = true;
        }
        if (count>5) {
          isFound = true;
          System.out.println("Word type: <unknown>");
          System.out.println("Thai translation: <unknown>");
        }
        count++;
      }
    }
  }
}
