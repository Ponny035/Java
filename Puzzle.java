import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Puzzle {
 public static Scanner scan;
  public static void main(String[] args) throws FileNotFoundException{
    scan = new Scanner(new File("WORD.txt"));
    //scan = new Scanner(System.in);
    //System.out.print("Input size of your cross word? (8 mean 8X8 Table): ");
    char[][] table = createTable(scan.nextInt(), scan.nextInt());
    //System.out.print("How many word do you want to fine? : ");
    String[] words = addWords(scan.nextInt());
    int[][] ans = find(table, words);
    printAns(ans,words);
  }
  public static void printAns(int[][] ans,String[] words) {
    int count=0;
    for(int i=0; i<words.length; i++) {
      if(ans[i][0] != -1) {
        System.out.println("word "+(i+1)+" "+words[i]+" is at Row "+(ans[i][0]+1)+" Column "+(ans[i][1]+1)+" at");
        position(ans[i][2]);
      }
      else {
        System.out.println("word "+i+" "+words[i]);
        count++;
      }
    }
  }
  public static  void position (int p) {
    switch (p) {
      case 1:
        System.out.println("up position");
        break;
      case 2:
        System.out.println("up-right position");
        break;
      case 3:
        System.out.println("right position");
        break;
      case 4:
        System.out.println("down-right position");
        break;
      case 5:
        System.out.println("down position");
        break;
      case 6:
        System.out.println("down-left position");
        break;
      case 7:
        System.out.println("left position");
        break;
      case 8:
        System.out.println("up-left position");
        break;
    }
  }
  public static int[][] find(char[][] table, String[] words) {
    int[][] ans = new int[words.length][3];
    for(int i=0 ;i<words.length;i++) {
      ans[i] = checkWord(table, words[i]);
    }
    return ans;
  }

  public static  int[] checkWord(char[][] table, String word) {
    int[] ans = new int[3];//0=x 1=y 2=position
    boolean check = false;
    for(int row=0; row<table.length; row++) {
      for (int column=0; column<table[0].length; column++ ) {
        if(word.charAt(0) == table[row][column]){
          ans[0] = row;
          ans[1] = column;
          for (int j=1;j<=8 ;j++ ) {
            switch (j) {
              case 1:
                if(((row+1)-word.length())>=0) {
                  for(int k=1;k<word.length();k++) {
                    if(word.charAt(k) != table[row-k][column]) {
                      ans[0] = row;
                      break;
                    }
                    if(k == (word.length()-1)) {
                      ans[2] = j;
                      check = true;
                    }
                  }
                }
                break;
              case 2:
                if((((row+1)-word.length())>=0)&&((column+word.length())<=table[0].length)) {
                  for(int k=1;k<word.length();k++) {
                    if(word.charAt(k) != table[row-k][column+k]) {
                      ans[0] = row;
                      break;
                    }
                    if(k == (word.length()-1)) {
                      ans[2] = j;
                      check = true;
                    }
                  }
                }
                break;
              case 3:
                if((column+word.length())<=table[0].length) {
                  for(int k=1;k<word.length();k++) {
                    if(word.charAt(k) != table[row][column+k]) {
                      ans[0] = row;
                      break;
                    }
                    if(k == (word.length()-1)) {
                      ans[2] = j;
                      check = true;
                    }
                  }
                }
                break;
              case 4:
                if(((column+word.length())<=table.length)&&((row+word.length())<=table[0].length)) {
                  for(int k=1;k<word.length();k++) {
                    if(word.charAt(k) != table[row+k][column+k]) {
                      ans[0] = row;
                      break;
                    }
                    if(k == (word.length()-1)) {
                      ans[2] = j;
                      check = true;
                    }
                  }
                }
                break;
              case 5:
                if((row+word.length())<=table.length) {
                  for(int k=1;k<word.length();k++) {
                    if(word.charAt(k) != table[row+k][column]) {
                      ans[0] = row;
                      break;
                    }
                    if(k == (word.length()-1)) {
                      ans[2] = j;
                      check = true;
                    }
                  }
                }
                break;
              case 6:
                if(((row+word.length())<=table.length)&&(((column+1)-word.length())>=0)) {
                  for(int k=1;k<word.length();k++) {
                    if(word.charAt(k) != table[row+k][column-k]) {
                      ans[0] = row;
                      break;
                    }
                    if(k == (word.length()-1)) {
                      ans[2] = j;
                      check = true;
                    }
                  }
                }
                break;
              case 7:
                if(((column+1)-word.length())>=0) {
                  for(int k=1;k<word.length();k++) {
                    if(word.charAt(k) != table[row][column-k]) {
                      ans[0] = row;
                      break;
                    }
                    if(k == (word.length()-1)) {
                      ans[2] = j;
                      check = true;
                    }
                  }
                }
                break;
              case 8:
                if((((column+1)-word.length())>=0)&&(((row+1)-word.length())>=0)) {
                  for(int k=1;k<word.length();k++) {
                    if(word.charAt(k) != table[row-k][column-k]) {
                      ans[0] = row;
                      break;
                    }
                    if(k == (word.length()-1)) {
                      ans[2] = j;
                      check = true;
                    }
                  }
                }
                break;
            }
            if(check) {
              ans[2] = j;
              break;
            }
          }
          if(check) {
            return ans;
          }
          else {
            ans[0] = -1;
          }
        }
      }
    }
    return ans;
  }

  public static String[] addWords(int size) {
    String[] words = new String[size];
    for (int i=0; i<size; i++) {
      words[i] =scan.next();
    }
    printWords(words);
    return words;
  }

  public static void printWords(String[] words) {
    // System.out.println("Your words is :");
    // for (int i=0; i<words.length; i++) {
    //   System.out.println(words[i]+ " ");
    // }
  }

  public static char[][] createTable (int rows, int columns) {
    char[][] table = new char[rows][columns];
    // System.out.println("Input your table like ");
    // System.out.println("q w e");
    // System.out.println("w s d");
    // System.out.println("w s a :");
    for(int row=0; row<rows; row++) {
      for (int column=0; column<columns; column++ ) {
        table[row][column] = scan.next().charAt(0);
      }
    }
    //printTable(table);
    return table;
  }

  public static void printTable(char table[][]){
    System.out.println("Your table is : ");
    for(int row=0; row<table.length; row++) {
      for (int column=0; column<table[0].length; column++ ) {
        System.out.print(table[row][column] + " ");
      }
      System.out.printf("\n");
    }
  }

}
