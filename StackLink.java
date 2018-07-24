import java.util.*;
public class StackLink {
  LinkedList stack = new LinkedList();
  public void push (int x) {
    stack.add(0,x);
    System.out.println("Add is "+x+" to your stack.");
  }
  public int pop () {
    int x = (int)stack.get(0);
    System.out.println("Remove is "+x+" to your stack.");
    stack.remove(0);
    return x;
  }
}
