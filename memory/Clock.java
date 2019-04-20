import java.util.LinkedList;

public class Clock<E>  {
  private int current = 0;
  private int size;
  private boolean[] track;

  private LinkedList<E> data = new LinkedList<E>();

  public Clock (int size) {
    this.size = size;
    track = new boolean[size];
  }

  public void addPage (E page) {
    if(data.size()<size) {
      data.add(current,page);
      track[current] = true;
      current++;
      if(current==size) {
        current = 0;
      }
    }
    else {
      int position = findPlace();
      data.set(position,page);
      track[position] = true;
    }
  }

  public int findPlace() {
    while(track[current]) {
      track[current] = false;
      current++;
      if(current==size) {
        current = 0;
      }
    }
    return current;
  }

  public boolean find (E value) {
    for (int i=0; i<data.size(); i++) {
      if(value == data.get(i)) {
        track[i] = true;
        return true;
      }
    }
    return false;
  }

  public void printAll () {
    System.out.print("Memory frame: ");
    for (int i=0; i<data.size(); i++) {
      if(data.get(i) != null) {
        System.out.print(data.get(i) + " ");
      }
    }
    System.out.println();
  }

  public void printTrack() {
    System.out.print("Tracking use: ");
    for(int i=0; i<data.size(); i++) {
      System.out.print(track[i] + " ");
    }
    System.out.println();
  }
}
