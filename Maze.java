import java.util.Scanner;
public class Maze{
  static int fun(int m[][],int r,int c){
    int i,j;

    if(m[0][0]==-1)
    return 0;
    for(i=0;i<r;i++)
    if(m[i][0]==0)
    m[i][0]=1;
    else break;
    for(i=1;i<c;i++)
    if(m[0][i]==0)
    m[0][i]=1;
    else break;

    for(i=1;i<r;i++)
    {
      for(j=1;j<c;j++)
      {
        if(m[i][j]==-1)
        continue;

          if(m[i-1][j]>0)
          m[i][j]=m[i-1][j]+m[i][j];
          if(m[i][j-1]>0)
          m[i][j]=m[i][j]+m[i][j-1];


      }
    }
    return m[r-1][c-1];
  }
  public static void main(String[] args) {
    int maze[][] =  {{0,  0, 0, 0},
                      {0, -1, 0, 0},
                      {-1, 0, 0, 0},
                      {0,  0, 0, 0}};
    System.out.println(fun(maze,4,4));
  }
}
