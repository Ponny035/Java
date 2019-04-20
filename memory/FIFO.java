// package com.patipol.fifo;

import java.util.LinkedList;

public class FIFO <E> {

  private int current = 0;
  private int size;

  private LinkedList<E> data = new LinkedList<E>();

  public FIFO (int size) {
    this.size = size;
  }

  public void addPage (E page) {
    if(data.size()!=size) {
      data.add(current,page);
    }
    else {
      data.set(current,page);
    }
    current++;
    if(current == size) {
      current = 0;
    }
  }

  public boolean find (E value) {
    for (int i=0; i<data.size(); i++) {
      if(value == data.get(i)) {
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
}
