
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int rows=a.length;
		int columns=a[0].length;
		int[][] result=new int[columns][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[j][i]=a[i][j];
			}
			
		}
      for (int i = 0; i < rows; i++) {
		for (int j = 0; j < columns; j++) {
			System.out.print(result[i][j]+" ");
		}
		System.out.println();
	}
	}

}
