import java.util.LinkedList;

public class LRU<E> {

  private int size;
  private int[] track;
  private LinkedList<E> data = new LinkedList<E>();

  public LRU (int size) {
    this.size = size;
    track = new int[size];
  }

  public boolean find (E value) {
    for (int i=0; i<data.size(); i++) {
      if(value == data.get(i)) {
        update(value);
        return true;
      }
    }
    return false;
  }

  public void addPage (E page) {
    if(data.size()!=size) {
      data.add(page);
      update(page);
    }
    else {
      data.set(getID(page),page);
      reset();
      update(page);
    }
  }

  private int getID (E value) {
    int min = 2147483647;
    int position = 0;
    for (int i=0; i<data.size(); i++) {
      if(min >= track[i]) {
        min = track[i];
        position = i;
      }
    }
    return position;
  }

  private void update (E value) {
    for (int i=0; i<data.size(); i++) {
      if(data.get(i) == value) {
        track[i]++;
      }
    }
  }

  public void reset() {
    for (int i=0; i<data.size(); i++) {
      track[i] = 0;
    }
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
