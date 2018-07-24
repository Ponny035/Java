import java.util.*;;
import java.io.*;
public class Dictionary2  {
  public static void main(String[] args) throws IOException {
    BufferedReader file = new BufferedReader(new FileReader("/Users/ponny/Documents/GitHub/Java-Code/longdo_en_th_new.txt"));
    Scanner scan = new Scanner(System.in);
    String[] word = new String[1343];
    String[] part = new String[1343];
    String[] meaning = new String[1343];
    for(int i = 0 ; i < 1343 ; i++) {
      String line = file.readLine();
      String[] temp = line.split("\t");
      word[i] = temp[0];
      int a = temp[1].indexOf(')');
      part[i] = temp[1].substring(1,a);
      meaning[i] = temp[2];
    }
    file.close();
    while(true) {
      System.out.print("Please enter an English word: ");
      String kum = scan.nextLine();
      int min=0;
      int max=1343;
      int count =1;
      while(count<12) {
        int mid = (min+max)/2;
        if(kum.compareToIgnoreCase(word[mid])<0){
          max=mid-1;
        }
        else if(kum.compareToIgnoreCase(word[mid])>0){
          min=mid+1;
        }
        if(kum.equalsIgnoreCase(word[mid])) {
          System.out.println("Word type: "+part[mid]);
          System.out.println("Thai translation: "+meaning[mid]);
          break;
        }
        count++;
      }
      if(count==12) {
        System.out.println("Word type: <unknown>");
        System.out.println("Thai translation: <unknown>");
      }
    }
  }
}
