
public class Question1 {

	public static void main(String[] args)
	{
		
		// WAP to find the duplicates present in an array.
		int[] a= {2,4,2,6,7,4,4,2,6};
		int[] br= new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=1; j<a.length-i; j++)
			{
				if(a[j]<a[j-1])
				{
					int tempVar=a[j];
					a[j]=a[j-1];
					a[j-1]=tempVar;
				}
			}
		}
	
	br=a;
	System.out.println("The sorted array is");
	for(int r:br)
	{
		System.out.print(r+" ");	
	}
	System.out.println();
	
	int j=0;
	int[] temp=new int[3];
	
	for(int k=0; k<br.length-1; k++)
	{
		if(br[k]!=br[k+1])
		{
			temp[j]=br[k];
			j++;
		}
		
	}
		System.out.println("The duplicate numbers are");
	for(int elem: temp)
		{
			System.out.print( elem+ " " );
		}
	}	
}


