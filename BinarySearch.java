import java.util.Scanner;
class BinarySearch{
	static int binarysearch(int a[],int f,int l,int x)
	{if(f<=l){
		int mid=(f+l)/2;
		if(a[mid]==x)
			return mid;
		else if(a[mid]<x)
			return binarysearch(a,mid+1,l,x);
		else return binarysearch(a,f,mid-1,x);
	}
	else return -1;
	}
	public static void main(String s[])
	{
		int n,i,a[],b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=in.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("\nEnter element to be searched: ");
		b=in.nextInt();
		int res=binarysearch(a,0,n-1,b);
        if(res==-1)
        	System.out.println("Not found");
        else System.out.println("Found at position: "+(res+1));
	}
}