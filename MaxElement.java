package Array;

public class MaxElement 
{
	public static void main(String[] args) 
	{
		int a[] = {4,9,8,7,6,3,1,56,45,78};
		
		int max=a[0];
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println("Maximun Element of an Array is :"+max);
	}
}
