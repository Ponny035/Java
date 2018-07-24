public class RemX {
  public static void main (String[] args) {
    System.out.println(remove("Hxexlxlxo"));
  }
  public static String remove(String word) {
    if(word.length()==0) {
      return "";
    }
    if(word.charAt(0)!='x') {
      return word.charAt(0)+remove(word.substring(1,word.length()));
    }
    else {
      return remove(word.substring(1,word.length()));
    }
  }
}
