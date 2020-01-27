import java.util.Scanner;

public class TicTacToe {
  private static int count=0;
  private static Scanner scan;
  private static String[][] table = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};

  // public static void main(String[] args) {
  //   scan = new Scanner(System.in);
  //   printTable();
  //   int[] testRun = {2,4,1,3,6,5,9,8,7};
  //   turn("x",testRun, 0);
  // }

  // auto
  public TicTacToe (int[] turns) {
    scan = new Scanner(System.in);
    printTable();
    turn("x",turns, 0);
  }
  // 2 players
  public TicTacToe () {
    scan = new Scanner(System.in);
    printTable();
    turn("x");
  }

  private static boolean turn(String player) {
    count++;
    if(count == (table.length*table[0].length)+1) {
      System.out.println("== Draw ==");
      return true;
    }
    System.out.println("This is "+player+ " turn.");
    scan = new Scanner(System.in);
    boolean check = false;
    while(!check) {
      System.out.print("which number in the table do you want to insert: ");
      int number  = scan.nextInt();
      check= add(number-1,player);
      if(!check) {
        System.out.println("That point is already insert please insert again.");
      }
    }
    printTable();
    if(isWin(player)) {
      System.out.println("Congrat!!!! "+player+" win.");
      return true;
    }
    else {
      if(player.equals("x")){
        turn("o");
      }
      else {
        turn("x");
      }
    }
    return false;
  }

  private static boolean turn(String player, int[] turns, int countTurn) {
    countTurn++;
    if(countTurn > (table.length*table[0].length)) {
      System.out.println("== Draw ==");
      return true;
    }
    System.out.println("This is "+player+ " turn.");
    boolean check = false;
    while(!check) {
      int number  = turns[countTurn-1];
      check= add(number-1,player);
    }
    printTable();
    if(isWin(player)) {
      System.out.println("Congrat!!!! "+player+" win.");
      return true;
    }
    else {
      if(player.equals("x")){
        turn("o",turns,countTurn);
      }
      else {
        turn("x",turns,countTurn);
      }
    }
    return false;
  }

  private static void printTable() {
    int row = 0;
    for (int i=0; i<7; i++) {
      if(i%2==0) {
        for (int j=0; j<7; j++) {
          if(j%2!=0) {
            System.out.print("-");
          }
          else {
            System.out.print(" ");
          }
        }
      }
      else {
        int column = 0;
        for (int j=0; j<7; j++) {
          if(j%2==0) {
            System.out.print("|");
          }
          else {
            if(table[row][column] == null) {
              System.out.print(" ");
            }
            else {
              System.out.print(table[row][column]);
            }
            column++;
          }
        }
        row++;
      }
      System.out.println();
    }
  }

  private static boolean add(int number, String player) {
    int row = number/table.length;
    int column = number%table[0].length;
    if(!((table[row][column].equals("x"))||(table[row][column].equals("o")))) {
      table[row][column] = player;
      return true;
    }
    else {
      return false;
    }
  }

  private static boolean isWin(String player) {
    //diagonal check
    if((player.equals(table[0][0]) && player.equals(table[1][1]) && player.equals(table[2][2])) || (player.equals(table[0][2]) && player.equals(table[1][1]) && player.equals(table[2][0]))) {
      return true;
    }
    //horizontal && vertical
    for(int i=0; i<table.length; i++) {
      if( (player.equals(table[0][i]) && player.equals(table[1][i]) && player.equals(table[2][i])) || (player.equals(table[i][0]) && player.equals(table[i][1]) && player.equals(table[i][2]))) {
        return true;
      }
    }
    return false;
  }
  public static int whoWin() {
    if(isWin("x")) {
      return 1;
    }
    if(isWin("o")) {
      return 2;
    }
    return 0;
  }
}
