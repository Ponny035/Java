import java.util.*;
public class CountOdd  {
  public void check(List<? extends Number> number) {
    int i=0;
    int count;
    while(i<number.size()) {
      double temp = number.get(i).doubleValue();
      if((temp%1==0)&&(temp%2!=0)) {
        count++;
      }
      i++;
    }
    System.out.print("Odd Number in this list : "+count);
  }

  public static void main(String[] args) {
    List<Integer> numI = new ArrayList<>();
    List<Double> numD = new ArrayList<>();
    for(int i=0;i<=10;i++) {
      numI.add(new Integer(i));
    }
    check(numI);
  }
}
