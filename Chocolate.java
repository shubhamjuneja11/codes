import java.util.Scanner;
import java.util.Arrays;
public class Chocolate {
  static int a[],m,n;

  static int chocolate(){
    int i,min;
    min=Integer.MAX_VALUE;
    for(i=0;i+m-1<n;i++)
    if(a[i+m-1]-a[i]<min)
    min=a[i+m-1]-a[i];
    return min;
  }
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int i;
    System.out.println("Enter n");
    n=in.nextInt();
    a=new int[n];
      System.out.println("Enter array");
    for(i=0;i<n;i++)
    a[i]=in.nextInt();
      System.out.println("Enter m");
    m=in.nextInt();
    Arrays.sort(a);
      System.out.println(chocolate());
  }
}
