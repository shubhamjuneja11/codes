import java.util.Scanner;
public class MersennePrime {
  static void sieve(boolean p[],int n){
    int i,j;
    for(i=0;i<n;i++)
    p[i]=true;
    for(i=2;i*i<=n;i++)
    {
      if(p[i])
      {
        for(j=i*2;j<n;j+=i)
        p[j]=false;
      }
    }
  }
  static void printmersenne(int n){
    int c,i;
    boolean p[]=new boolean[n+1];
    sieve(p,n);
    for(i=4;i-1<n;){
      c=i-1;
      if(p[c])
      System.out.print(c+" ");

      i=i<<1;
    }
  }
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n;
    System.out.println("Enter n");
    n=in.nextInt();
    printmersenne(n);
  }
}
