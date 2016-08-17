import java.util.Scanner;

 public class InsertionSort{
	static void insertionsort(int a[],int n){
		int i,j,k;
		for(i=1;i<n;i++){
			j=i-1;k=a[i];
			while(j>=0&&a[j]>k){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=k;
		}
	}
	public static void main(String s[]){
		int n,a[],i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=in.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		insertionsort(a,n);
		System.out.println("Sorted elements are:  ");
		for(i=0;i<n;i++)
      	System.out.print(a[i]+" ");
	}
}