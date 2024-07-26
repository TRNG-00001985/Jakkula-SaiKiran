
public class MaxMinusMin {
		public static int maxMinDifference(int[] a)	
		{
			if (a== null  && a.length== 0) {
				System.out.println("Array should not be empty");
					
			}
			int max=a[0];
			int min=a[0];
			for (int i = 0; i < a.length; i++) {
				if (a[i]>max) {
					max=a[i];
				}
				if (a[i]<min) {
					min=a[i];
				}
				
			}	
			int Minus=max-min;
			return Minus;
		}
		public static void main(String[] args) 
		{
			int[] array= {1,3,2,5,4,7,9,8};
			
			int Minus=maxMinDifference(array);
			System.out.println("max  minus min ="+Minus);
		}
}
