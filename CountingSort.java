import java.util.Scanner;
class CountingSort{
	public void countingsort(int a[],int n){
		int count[],i,out[];
		out=new int[n];
		count=new int[200];
		for(i=0;i<200;i++)
			count[i]=0;
		for(i=0;i<n;i++)
			count[a[i]]++;
		for(i=1;i<200;i++)
			count[i]=count[i-1];
		for(i=0;i<n;i++)
		{System.out.println(a[i]-1);
			out[count[a[i]]-1]=a[i];
			count[a[i]]--;
		}
		for(i=0;i<n;i++)
			a[i]=out[i];
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
		new CountingSort().countingsort(a,n);
		System.out.println("Sorted elements are:  ");
		for(i=0;i<n;i++)
      	System.out.print(a[i]+" ");
	}
}