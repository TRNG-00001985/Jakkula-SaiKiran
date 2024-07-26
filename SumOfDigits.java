import java.util.Iterator;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=54321,sum=0;
		String str=Integer.toString(num);
				
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
	}
		System.out.println("Sum of digits : "+sum);
	}

}
