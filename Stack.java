import java.util.*;
public class Stack {
  public static void main(String[] args) {
    StackLink stack = new StackLink();
    stack.push(1);
    stack.push(45);
    stack.push(245);
    stack.push(3);
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
  }
}
