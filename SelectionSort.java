import java.util.Scanner;
class SelectionSort
{static void selectionsort(int a[],int n){
	int i,minp,j,temp;
	for(i=0;i<n;i++)
	{minp=i;
		for(j=i+1;j<n;j++)
		{
			if(a[minp]>a[j])
				minp=j;
		}
		int temp2=a[minp];
		a[minp]=a[i];
		a[i]=temp2;
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
		selectionsort(a,n);
		System.out.println("Sorted elements are:  ");
		for(i=0;i<n;i++)
      	System.out.print(a[i]+" ");
	}
}