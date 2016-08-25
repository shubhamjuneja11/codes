import java.util.Scanner;
public class MergeSort{
	private void merge(int a[],int l,int m,int r){
		int n1=m-l+1;
		int n2=r-m;
		int i,j,f[],la[],k;
		f=new int[n1];
		la=new int[n2];
		for(i=0;i<n1;i++)
			f[i]=a[l+i];
		for(j=0;j<n2;j++)
			la[j]=a[j+m+1];
		i=j=0;k=l;
		while(i<n1&&j<n2){
			if(f[i]<=la[j])
				a[k++]=f[i++];
			else a[k++]=la[j++];
		}
		while(i<n1)
			a[k++]=f[i++];
		while(j<n2)
			a[k++]=la[j++];

	}
	private void mergesort(int a[],int l,int r){
		if(l<r)
		{int m=(r+l)/2;
			mergesort(a,l,m);
			mergesort(a,m+1,r);
			merge(a,l,m,r);
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
		new MergeSort().mergesort(a,0,n-1);
		System.out.println("Sorted elements are:  ");
		for(i=0;i<n;i++)
      	System.out.print(a[i]+" ");
	}
}