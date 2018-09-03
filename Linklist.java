public class Linklist<T>  {
  Node<T> head;
  Node<T> pointer;
  public Linklist() {
    head = new Node<T>();
    pointer = head;
  }
  public Linklist(T value) {
    head = new Node<T>(value);
    pointer = head;
  }
  public void add (T value) {
    if(pointer.get() == null) {
      pointer.add(value);
    }
    else {
      while(pointer.next() != null) {
        pointer = pointer.next();
      }
      Node node = new Node<T>(value);
      pointer.setNext(node);
    }
    pointer = head;
  }
  public void add (int n, T value) {
    if(n==0) {
      Node node = new Node<T>(value, head);
      head = node;
    }
    else {
      for(int i=0; i<n-1; i++) {
        pointer = pointer.next();
      }
      Node node = new Node<T>(value, pointer.next());
      pointer.setNext(node);
    }
    pointer = head;
  }
  public void remove () {
    while((pointer.next()).next() != null) {
      pointer = pointer.next();
    }
    pointer.setNext(null);
    pointer = head;
  }
  public void remove (int n) {
    Node temp;
    for(int i=0; i<n; i++) {
      pointer = pointer.next();
    }
    temp = pointer.next();
    pointer = head;
    for(int i=0; i<n-1; i++) {
      pointer = pointer.next();
    }
    pointer.setNext(temp);
    pointer = head;
  }

  public void set (int n, T value) {
    for(int i=0; i<n; i++) {
      pointer = pointer.next();
    }
    pointer.add(value);
    pointer = head;
  }

  public T get (int n) {
    Node<T> temp;
    for(int i=0; i<n; i++) {
      pointer = pointer.next();
    }
    temp = pointer;
    pointer = head;
    return temp.get();
  }
}
