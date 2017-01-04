import java.util.Scanner;
public class Pyramid{
  static  int i,j;
  static void right(int n){

    for(i=0;i<5;i++)
    {
      for(j=0;j<=i;j++)
      System.out.print("* ");
      System.out.println();
    }
  }
  static void right1(int n){
    String s="*";
    for(i=0;i<n;i++)
    {System.out.println(s);s+=" *";}

  }
  static void pyramid(int n){
    for(i=0;i<=n;i++){
      for(j=0;j<=n-i-1;j++)
      System.out.print(" ");
      for(;j<n;j++)
      System.out.print("* ");
        System.out.println();
    }
  }
  static void left(int n){
    int k=2*n-2,p;
    for(j=0;j<n;j++){
    for(i=0;i<k;i++)
    System.out.print(" ");
    k-=2;
    for(p=0;p<=j;p++)
      System.out.print("* ");
        System.out.println();
  }
  }
  
  public static void main(String[] args) {
    int n;
    Scanner in= new Scanner(System.in);
    n=in.nextInt();
    left(n);
  }
}
