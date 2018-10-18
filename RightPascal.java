import java.util.Scanner;
public class RightPascal
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int row = scan.nextInt();

    long[][] ans = new long[row][row];
    ans[0][0]=1;
    ans[1][0]=1;
    ans[1][1]=1;
    for(int j=0; j<row; j++)
    {
      ans[j][0]=1;
      ans[j][j]=1;
    }

    for(int j=2; j<row; j++)
    {
      for(int a=1; a<j ; a++)
      {
        ans[j][a]=ans[j-1][a-1] + ans[j-1][a];//????????? ????
      }
    }
    for(int j=0; j<row; j++)
    {
      System.out.println("x");
      System.out.println(ans[row-1][j]);
    }
  }
}
