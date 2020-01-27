public class Play {
  public static void main(String[] args) {
    int[] a = new int[9];
    int count=0;
    while(count<a.length) {
      int b = (int)(Math.random()*10)+1;
      if(check(a,b)) {
        a[count]=b;
        count++;
      }
    }
    for(int i=0;i<a.length;i++) {
      System.out.print(a[i]);
    }
    System.out.println();
    TicTacToe t = new TicTacToe(a);
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
