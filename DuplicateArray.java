
public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,4,3,7,8,5,6,7,8,9};
		System.out.print("Duplicates in an Array :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
