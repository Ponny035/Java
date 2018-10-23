public class Permutation  {
  int count = 0;
  int[] value;
  int[] arrow;
  String list = "";
  int n;

  public Permutation (int n) {
    this.n = n;
    // -1 left(<--) 1 right(-->) 0 no stage
    value = new int[n+2];
    arrow = new int[n+2];
    value[0] = 100; // prevent -1<0
    value[n+1] = 100; // prevent -1<0
    for(int i=1;i<n+1;i++) {
      value[i] = i;
      arrow[i] = -1;
    }
    createPermutation();
  }

  public void createPermutation () {
    int mobile = largeMobile();
    addToList();
    while (true) {
      // swap
      mobile = swap(mobile);
      // revese all bigger value
      revese(mobile);
      // add to list
      addToList();
      // lagre mobile
      mobile = largeMobile();
      if(mobile == -1) {
        break;
      }
    }
  }

  public void addToList () {
    String v = "" ;
    for(int i=1;i<=n;i++) {
      v += value[i];
    }
    v +=" ";
    if(count == n) {
      list += "\n";
      count = 0;
    }
    count++;
    list += v;
  }
  public void revese(int position) {
    for(int i=1;i<=n;i++) {
      if(value[position]<value[i]){
        arrow[i] = -1*arrow[i];
      }
    }
  }

  public int largeMobile () {
    int position = -1;
    for(int i=1;i<=n;i++) {
      if((position==-1)&&(value[i]>value[i+arrow[i]])) {
        position =i;
      }
      else if ((position!=-1)&&(value[i]>value[i+arrow[i]])&&value[i]>value[position]) {
        position =i;
      }
    }
    return position;
  }

  public int swap (int position) {
    int newPosition =position+arrow[position];
    int temp = value[position];
    value[position] = value[newPosition];
    value[newPosition] =temp;
    temp = arrow[position];
    arrow[position] = arrow[newPosition];
    arrow[newPosition] =temp;
    return newPosition;
  }

  public int factorial (int n ) {
    if(n>2) {
      return n*factorial(n-1);
    }
    else
    {
      return n;
    }
  }

  public String getList() {
    return list;
  }
}
