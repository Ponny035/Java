import java.util.Arrays;
public class sort {
  public static void main(String[] args) {

  }
  public static int[] sort (int[] arr) {
    for (int i=0;i<arr.length ;i++ ) {
      int temp;
      int index = i;
      for (int j=(i+1);j<arr.length ;j++ ) {
        if(arr[index]>arr[j]) {
          index = j;
        }
      }
      temp = arr[i];
      arr[i] = arr[index];
      arr[index] =temp;
    }
    return arr;
  }
}
