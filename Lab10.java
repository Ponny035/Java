//package /Users/ponny/Documents/GitHub/Java-Code;

//import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Lab10 {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<Integer, String>();
    // //Integer i = new Integer(21);
    // try{
    //   Integer.parseInt(21);
    // }catch(Exception e){
    //   e.toString();
    // }
    map.put(21,"First");
    //map.put(new Integer(75),"Second");
    System.out.println(map.get(21));
  }
}
