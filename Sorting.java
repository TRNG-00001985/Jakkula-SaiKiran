import java.util.Iterator;

public class Sorting {

	public static void main(String[] args) {
		System.out.print("Ascending Order : ");
		int[] a= {45,67,12,48,87,99,35,69};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
	}

}
