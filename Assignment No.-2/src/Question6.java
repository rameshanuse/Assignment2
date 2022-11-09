
public class Question6 {

	public static void main(String[] args) {
		
		//WAP to check whether an array is a subset of another array.
		
		int[] ar= {3,2,4,1,8,6,9,56,43,87,55};
		int[] br= {1,3,4,2,56,87};
		
		int count=0;
	
		
		for(int i=0;i<br.length;i++)
		{
			for(int j=0; j<ar.length; j++)
			{
				if(br[i]==ar[j])
				{
					count++;
					
				}
			}	
		}
		if(count==br.length)
		{
			System.out.println("The array br is subset of array ar");
		}
		else if(count!=br.length)
		{
			System.out.println("The array br is not subset of array ar");
		}
	}
	

}
