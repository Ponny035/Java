
public class OS {
  public static void main(String[] args) {
    // for(int round=0; round<100; round++) {
      int[] random = new int[100];
      int rate = 0;
      FIFO memory = new FIFO<Integer>(5);
      for(int i=0; i<100; i++) {
        double input = Math.random();
        random[i] = (int)(input * 10)+1;
      }
      for (int i=0; i<100; i++) {
        System.out.println(random[i]);
        if(!(memory.find(random[i]))) {
          System.out.println("Fault!!");
          memory.addPage(random[i]);
        }
        else {
          System.out.println("HIT!!");
          rate++;
        }
        memory.printAll();
        // memory.printTrack();
      }
      System.out.println("FIFO Hit rate = "+rate+"%");
      // rate = 0;
      // LRU memory2 = new LRU<Integer>(5);
      // for (int i=0; i<100; i++) {
      //   if(!(memory2.find(random[i]))) {
      //     // System.out.println("Fault!!");
      //     memory2.addPage(random[i]);
      //   }
      //   else {
      //     // System.out.println("HIT!!");
      //     rate++;
      //   }
      //   // memory2.printAll();
      //   // memory2.printTrack();
      // }
      // System.out.println("LRU Hit rate = "+rate+"%");
      // rate = 0;
      // Clock memory3 = new Clock<Integer>(5);
      // for (int i=0; i<100; i++) {
      //   if(!(memory3.find(random[i]))) {
      //     // System.out.println("Fault!!");
      //     memory3.addPage(random[i]);
      //   }
      //   else {
      //     // System.out.println("HIT!!");
      //     rate++;
      //   }
      //   // memory3.printAll();
      //   // memory3.printTrack();
      // }
      // System.out.println("Clock Hit rate = "+rate+"%");
      // System.out.println();
    }
  // }
}
