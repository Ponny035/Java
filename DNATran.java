import java.util.Scanner;
public class DNATran {
  private static Scanner scan;
  private static String protein = "";
  public static void main(String[] args) {
    scan = new Scanner(System.in);
    System.out.print("Input Your DNA: ");
    String DNASequence = scan.nextLine();
    String RNASequence = DNASequence.toUpperCase().replace("T","U");
    while (!(findStart(RNASequence).equals("-1"))) {
      String[] value = findProtein(findStart(RNASequence));
      protein = protein + value[0];
      RNASequence = value[1];
    }

    System.out.println(protein);
  }

  public static String[] findProtein (String sequence) {
    String[] value = new String[2];
    String protein;
    value[0] ="M";
    value[1] = sequence;
    while(value[1].length()>=3) {
      protein =transcription(value[1].substring(0,3));
      if(protein == "Stop") {
        value[0] =  value[0] + "\n";
        value[1] = value[1].substring(3);
        break;
      }
      else {
        value[0] =  value[0] + protein;
        value[1] = value[1].substring(3);
      }
    }
    return value;
  }

  public static String findStart (String RNASequence ) {
    // find AUG
    if(RNASequence.length()>=3) {
      for(int i=2; i<RNASequence.length(); i+=3) {
        if (RNASequence.charAt(i)=='G') {
          if (RNASequence.charAt(i-1)=='U') {
            if (RNASequence.charAt(i-2)=='A') {
              return RNASequence.substring(i+1);
            }
          }
        }
      }
    }
    return "-1";
  }

  public static String transcription (String RNA) {
    switch (RNA) {
      case "UUU":
      case "UUC" : {
        return "F";
      }
      case "UUA":
      case "CUU":
      case "CUC":
      case "CUA":
      case "CUG":
      case "UUG" : {
        return "L";
      }
      case "AUU":
      case "AUC":
      case "AUA" : {
        return "I";
      }
      case "AUG" : {
        return "M";
      }
      case "GUU":
      case "GUC":
      case "GUA":
      case "GUG" : {
        return "V";
      }
      case "UCU":
      case "UCC":
      case "UCA":
      case "UCG" :
      case "AGU" :
      case "AGC" : {
        return "S";
      }
      case "CCU":
      case "CCC":
      case "CCA":
      case "CCG" : {
        return "P";
      }
      case "ACU":
      case "ACC":
      case "ACA":
      case "ACG" : {
        return "T";
      }
      case "GCU":
      case "GCC":
      case "GCA":
      case "GCG" : {
        return "A";
      }
      case "UAU":
      case "UAC" : {
        return "Y";
      }
      case "UAA":
      case "UGA":
      case "UAG" : {
        return "Stop";
      }
      case "CAU":
      case "CAC" : {
        return "H";
      }
      case "CAG":
      case "CAA" : {
        return "Q";
      }
      case "AAU":
      case "AAC" : {
        return "N";
      }
      case "AAA":
      case "AAG" : {
        return "K";
      }
      case "GAU":
      case "GAC" : {
        return "D";
      }
      case "GAA":
      case "GAG" : {
        return "E";
      }
      case "UGU":
      case "UGC" : {
        return "C";
      }
      case "UGG" : {
        return "W";
      }
      case "CGU":
      case "CGC":
      case "CGA":
      case "CGG" :
      case "AGA" :
      case "AGG" : {
        return "R";
      }
      case "GGU":
      case "GGC":
      case "GGA":
      case "GGG" : {
        return "G";
      }
    }
    return "Error";
  }
}
