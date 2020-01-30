public class Play {
  public static void main(String[] args) {
    int WinX = 0;
    int WinO = 0;
    int draw = 0;
    for(int round=0; round<1000000000; round++) {
      System.out.println("round " +round);
      int[] a = new int[9];
      int count=0;
      while(count<a.length) {
        int b = (int)(Math.random()*10);
        if(b==0) {
          b++;
        }
        if(check(a,b)) {
          a[count]=b;
          count++;
        }
      }
      TicTacToe t = new TicTacToe(a);
      switch(t.whoWin()) {
        case 1:
          WinX++;
          break;
        case 2:
          WinO++;
          break;
        default :
          draw++;
      }
      t.clearTable();
  }
  System.out.println("X win = " + WinX);
  System.out.println("O win = " + WinO);
  System.out.println("Draw = " + draw);
}
  public static boolean check(int[] arr, int a) {
    for(int i=0; i<arr.length; i++) {
      if(arr[i]== a) {
        return false;
      }
    }
    return true;
  }
}
