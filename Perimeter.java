import java.util.Scanner;
public class Perimeter{
static  int a[][],R=3,C=5;
/*static int mat[R][C] =
    {

        {0, 1, 0, 0, 0},
        {1, 1, 1, 0, 0},
        {1, 0, 0, 0, 0}
    };*/
  public static  int count(int i,int j){
    int count=0;
  //up
  if(i>0&&a[i-1][j]==1)
    count++;
  //right
  if(j<C-1&&a[i][j+1]==1)
    count++;
  //down
  if(i<R-1&&a[i+1][j]==1)
    count++;
  //left
  if(j>0&&a[i][j-1]==1)
    count++;
  return count;
  }
  public static int perimeter(int r,int c){
    int i,j,per=0;
    for(i=0;i<r;i++)
    for (j=0;j<c;j++ )
    if(a[i][j]==1)
    {
      per+=4-count(i,j);
    }
    return per;
  }
  public static void main(String[] args) {
    int i,j;
    Scanner in=new Scanner(System.in);
    a=new int[R][C];
    System.out.println("Enter rows=");
    R=in.nextInt();
      System.out.println("Enter columns=");
    C=in.nextInt();
    for(i=0;i<R;i++)
    for(j=0;j<C;j++)
    a[i][j]=in.nextInt();
  System.out.println("Result=");
    System.out.println(perimeter(R,C));
  }

}
