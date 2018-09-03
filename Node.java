class Node <E> {
  private E value;
  private Node next;
  public Node () {
    this.value = null;
    next = null;
  }
  public Node (E value) {
    this.value = value;
    next = null;
  }

  public Node (E value, Node node) {
    this.value = value;
    next = node;
  }

  public void add (E value) {
    this.value = value;
  }

  public E get () {
    return value;
  }

  public void setNext (Node next) {
    this.next = next;
  }

  public Node next() {
    return next;
  }
}
