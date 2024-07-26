
public class ArraysAreEqual {

	public static void main(String[] args) {
		
		int[] a= {7,8,9};
		int[] b= {7,8,9};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print("True");
				}
				else 
				{
					System.out.print("False");
				}
			}
		}

	}

}
