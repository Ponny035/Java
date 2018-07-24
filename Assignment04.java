import java.util.*;
import java.io.*;
public class Assignment04{
  public static void main(String[] args)throws IOException{
    BufferedReader file = new BufferedReader(new FileReader("/Users/ponny/Documents/GitHub/Java-Code/longdo_en_th_new.txt"));
    Scanner sc = new Scanner(System.in);
    String[] word = new String[1343];
    String[] part = new String[1343];
    String[] meaning = new String[1343];
    for(int i = 0 ; i < 1343 ; i++){
      String line = file.readLine();
      String[] temp = line.split("\t");
      word[i] = temp[0];
      int t = temp[1].indexOf(')');
      part[i] = temp[1].substring(1,t);
      meaning[i] = temp[2];
    }
    file.close();
    while(true){
      System.out.print("Please enter an English word: ");
      String search = sc.nextLine();
      int min = 0;
      int max = 1342;
      int count = 1;
      while(count<12){
        int mid = (min+max)/2;
        if(search.equalsIgnoreCase("à la carte")){
          mid = 1;
        }
        else if(search.equalsIgnoreCase("a la carte")){
          mid = 2;
        }
        else if(search.equalsIgnoreCase("a load of"))  {
          mid = 3;
        }
        else if(search.equalsIgnoreCase("déjà vu")) {
          mid = 323;
        }
        if(search.compareToIgnoreCase(word[mid])<0){
          max = mid-1;
        }
        else if(search.compareToIgnoreCase(word[mid])>0){
          min = mid+1;
        }
        if(search.equalsIgnoreCase(word[mid])){
          System.out.println("Word type: "+part[mid]);
          System.out.println("Thai translation: "+meaning[mid]);
          break;
        }
        count++;
      }
      if(count >11){
        System.out.println("Word type: <unknown>");
        System.out.println("Thai translation: <unknown>");
      }
    }
  }
}
