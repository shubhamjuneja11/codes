import java.util.Scanner;
public class NaturalNumber {
  static int gcd(int a,int b){
    if(b==0)
    return a;
    else return gcd(b,a%b);
  }
  static int fun(String s){
    int i,j,a,b;
    char c[]=s.toCharArray();
    for(i=0;i<c.length;i++)
    if(c[i]=='.')
    break;

    a=Integer.valueOf(s.substring(0,i));
    b=Integer.valueOf(s.substring(i+1,c.length));
    a=a*(int)Math.pow(10,c.length-i-1)+b;
    int m=(int)Math.pow(10,c.length-1-i);
    return (m/gcd(a,m));
  }
  public static void main(String[] args) {
    String s;
    Scanner in=new Scanner(System.in);
    s=in.nextLine();
    System.out.println(fun(s));
  }
}
