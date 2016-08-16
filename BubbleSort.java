import java.util.Scanner;
class BubbleSort{
	static void bubblesort(int a[],int n){
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp2=a[j+1];
					a[j+1]=a[j];
					a[j]=temp2;
				}
			}
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
		bubblesort(a,n);
		System.out.println("Sorted elements are:  ");
		for(i=0;i<n;i++)
      	System.out.print(a[i]+" ");
}
}