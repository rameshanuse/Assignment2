//Q4->WAP to sort an array using Merge Sort Algorithm.

public class Question4 {

	public static void conquer(int ar[], int si, int mid, int ei)
	{
		int merged[] = new int[ei-si+1];
		
		int idx1 = si;
		int idx2 = mid+1;
		int x=0;
		
		while(idx1 <= mid && idx2 <=ei)
		{
			if(ar[idx1] <= ar[idx2])
			{
				merged[x++]= ar[idx1++];
			}
			else
			{
				merged[x++]= ar[idx2++];
			}
		}
		
		while(idx1 <= mid)
		{
			merged[x++] = ar[idx1++];
		}
		
		while(idx2 <= ei)
		{
			merged[x++] = ar[idx2++];
		}
		
		for(int i=0, j=si; i<merged.length; i++, j++)
		{
				ar[j]=merged[i];
		}
	}
	public static void divide(int ar[], int si, int ei) 
	{
		if(si >= ei)
		{
			return;
		}
		
		int mid= si + (ei -si)/2;
		divide(ar, si, mid);
		divide(ar, mid+1, ei);
		conquer(ar, si, mid, ei);
		
	}
	public static void main(String[] args) {
		int[] ar= {6,4,7,8,2,9,1,5,3};
		int n=ar.length;

		divide(ar, 0, n-1);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();

	}

}
