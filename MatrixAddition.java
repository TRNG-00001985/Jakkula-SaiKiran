import java.util.Iterator;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=3;
		int columns=3;
		int [][]a = {{1,2,3},{4,5,6},{4,5,6}};
		int [][]b= {{7,8,9},{3,4,5},{4,5,6}};
		int [][]result=new int[rows][columns];
	    for (int i = 0; i < rows; i++) {
	    	for (int j = 0; j < columns; j++) {
				result[i][j]=a[i][j]+b[i][j];
			}
			
		}
		for (int i = 0; i<rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}	
		

	}

}
