//Q5-> WAP to sort an array using Selection Sort Algorithm.
public class Question5 {

	public static void main(String[] args) {
		int[] ar= {8,4,3,6,2,7,9,5};
		
		for(int i=0; i<ar.length-1; i++)
		{
			int smallest=i;
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[smallest]>ar[j])
				{
					smallest=j;
				}
			}
			int temp=ar[smallest];
			ar[smallest]=ar[i];
			ar[i]=temp;
		}
		for(int el:ar)
		{
			System.out.print(el+" " );
		}
		
	}

}
