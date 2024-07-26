
public class MultiplicationMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row1=3;
		int col1=3;
		int row2=3;
		int col2=3;
		int[][] a= {{1,2,3},{4,5,6},{6,7,8}};
		int[][] b= {{2,3,4},{4,5,6},{7,8,9}};
		int[][] result=new int [row1][col1];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				for (int k = 0; k<row2;k++) {
					result[i][j]+=a[i][k]*b[k][j];
				}
				
			}
			
		}
		for (int j2 = 0; j2 < row1; j2++) {
			for (int j1 = 0; j1 < col1; j1++) {
				System.out.print(result[j2][j1]+" ");
			}
			System.out.println();
		}
		
	}

}
