import java.util.*;

public class Parenthesis {
  public static void main(String[] args) {
    LinkedList<String> stack = new LinkedList<>();
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    for(int i=0; i< word.length(); i++) {
      if(word.charAt(i)=='(') {
        stack.push(word);
      }
      else if(word.charAt(i)==')') {
        String a = stack.pop();
      }
    }
    System.out.println(check(stack));
  }
  public static boolean check(LinkedList<String> name) {
    if(name.size()==0) {
      return true;
    }
    return false;
  }
}
