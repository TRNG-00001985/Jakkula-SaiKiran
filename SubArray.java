import java.util.Arrays;
import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		int [] arr= {4,3,6,7,7,8,9,23,43,56,76,98};
		Scanner sc=new Scanner(System.in);
	  System.out.println("enter starting number : ");
		int start=sc.nextInt();
		System.out.println("enter ending number : ");
		int end=sc.nextInt();
		int[] subarr=Arrays.copyOfRange(arr,start, end);
		System.out.print("Sub Array Elements :");
		for(int i :subarr)
		{
		 System.out.print(i+" ");
		}

	}

}
