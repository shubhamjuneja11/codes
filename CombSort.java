import java.util.Scanner;
public class CombSort{
int temp;
	private int findgap(int n)
	{
		int a=(n*10)/13;
		if(a>1)
			return a;
		else return 1;
	}
	private void combsort(int a[],int n){
		boolean swap=true;
		int gap=n;
		while(gap!=1&&swap)
		{
			gap=findgap(gap);
			swap=false;
			for(int j=0;j<n-gap;j++)
			{
				if(a[j]>a[j+gap])
					{
						temp=a[j];
						a[j]=a[j+gap];
						a[j+gap]=temp;
						swap=true;
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
		new CombSort().combsort(a,n);
		System.out.println("Sorted elements are:  ");
		for(i=0;i<n;i++)
      	System.out.print(a[i]+" ");
	}
}