import java.util.Scanner;

public class OCGame {

  private static Scanner scan;

  public static void main(String[] args) {
    boolean isReplay = true;
    while(isReplay) {
      game();
      System.out.print("Do you want to play again? (y/n): ");
      isReplay = checkYN();
    }
    System.out.println("Ok, bye! See you next time.");
  }

  private static void game () {
    boolean check;
    boolean isWin = false;
    int turn = 0;
    System.out.println("Welcome to the The Open-Closed Game!");
    System.out.println("Do you want to see the rule first or not? (y/n): ");
    check = checkYN();
    if(check) {
      printRule();
    }
    while(!isWin) {
      isWin = playTurn(turn);
      turn = (turn == 0) ? 1:0;
    }
  }

  private static boolean checkYN () {
    scan = new Scanner(System.in);
    boolean[] checkNotPass = new boolean[]{false, true};
    while(checkNotPass[1]) {
      checkNotPass = valYN ( scan.nextLine());
    }
    return checkNotPass[0];
  }

  private static boolean[] valYN (String input) {
    if(input.equalsIgnoreCase("n")) {
      return new boolean[]{false, false};
    }
    else if (input.equalsIgnoreCase("y")) {
      return new boolean[]{true, false};
    }
    else {
      System.out.println("Bad input (code:10): Please input (y or n).");
      return new boolean[]{false, true};
    }
  }

  private static void printRule () {
    System.out.println("Rule: ");
    System.out.println("You need to play this game against the computer.");
    System.out.println("You will always be the predictor first.");
    System.out.println("For each round, the computer will expect player input in the following format if you are the predictor:");
    System.out.println("OC2");
    System.out.println("Or if you are not the predictor:");
    System.out.println("CO");
    System.out.println("That is, the first two characters will show how you will play your hands, O for open or C for closed.");
    System.out.println("If you are the predictor, you also need to enter a third character which is your prediction for how many open hands in total.");
    System.out.println("The game will end if one player win.");
  }

  private static boolean playTurn (int turn) {
    int[] player;
    int AIHand = (int)((Math.random()/0.9)*2);
    if(turn == 0) {
      System.out.println("You are the predictor, what is your input? : ");
      player = input(0);
      System.out.println("AI: " + output(AIHand));
      return checkWin(0,player[0],AIHand,player[1]);
    }
    else {
      int predict = (int)((Math.random()/0.9)*4);
      System.out.println("AI is the predictor, what is your input?");
      player = input(1);
      System.out.println("AI: " + output(AIHand) + predict);
      return checkWin(1,player[0],AIHand,predict);
    }
  }

  private static boolean checkWin (int turn, int player, int AIHand, int predict) {
    if(turn == 0) {
      if(AIHand+player == predict) {
        System.out.println("You WIN!!");
        return true;
      }
      else {
        System.out.println("No winner.");
        return false;
      }
    }
    else {
      if(AIHand+player == predict) {
        System.out.println("AI WIN!!");
        return true;
      }
      else {
        System.out.println("No winner.");
        return false;
      }
    }
  }

  private static int[] input (int turn) {
    int[] inputConvert = new int[3];
    scan = new Scanner(System.in);
    while (inputConvert[2] == 0) {
      String input = scan.nextLine();
      inputConvert = valInput (turn, input);
    }
    return inputConvert;
  }

  private static int[] valInput (int turn, String input) {
    String pattern = "ccocoo";
    int[] inputConvert = new int[3];
    if(turn == 0) {
      if(input.length() == 3) {
        int temp = pattern.indexOf(input.substring(0, 2).toLowerCase());
        try {
          inputConvert[1] = Integer.parseInt(input.substring(2));
          if(inputConvert[1]>4) {
            throw new NumberFormatException();
          }
          if(temp>-1) {
           if(temp < 3 && temp != 0) {
              inputConvert[0] = 1;
            }
            else {
              inputConvert[0] = 2;
            }
          }
          else {
            throw new NumberFormatException();
          }
          inputConvert[2] = 1;
        }
        catch (NumberFormatException e) {
          System.out.println("Bad input (code:1): Please input associate to your turn. (Predictor)");
        }
      }
      else {
        System.out.println("Bad input (code:2): Please input associate to your turn. (Predictor)");
      }
    }
    else {
      if(input.length() == 2) {
        int temp = pattern.indexOf(input.substring(0, 2).toLowerCase());
        try {
          if(temp>-1) {
            if(temp < 3 && temp != 0) {
              inputConvert[0] = 1;
            }
            else {
              inputConvert[0] = 2;
            }
          }
          else {
            throw new NumberFormatException();
          }
          inputConvert[2] = 1;
        }
        catch (NumberFormatException e) {
          System.out.println("Bad input (code:1): Please input associate to your turn. (Not Predictor)");
        }
      }
      else {
        System.out.println("Bad input (code:2): Please input associate to your turn. (Not Predictor)");
      }
    }

    return inputConvert;
  }

  private static String output (int AIHand) {
    if(AIHand == 0) {
      return "cc";
    }
    else if(AIHand == 2) {
      return "oo";
    }
    else {
      if(Math.random()>0.5) {
        return "oc";
      }
      else {
        return "co";
      }
    }
  }

  public String testOutput (int AIHand) {
    return output(AIHand);
  }

  public boolean testValYN (String input) {
    boolean[] temp = valYN(input);
    return temp[0];
  }

  public int[] testValInput (int turn,String input) {
    return valInput(turn,input);
  }

  public boolean testCheckWin (int turn, int player, int AIHand, int predict) {
    return checkWin(turn, player, AIHand, predict);
  }

}
