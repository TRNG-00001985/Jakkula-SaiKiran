
public class Search2dArray {

		  public static boolean search(int[][] matrix,int target)
		{
		  int rows=matrix.length;
		  int cols=matrix[0].length;
		  for (int i=0;i<rows ;i++ )
		  {
		    for (int j=0;j<cols ;j++ )
		    {
		      if (matrix[i][j]==target)
		      {
		      return true;
		      }
		     
		    }
		  }
		  return false;
		}
		  public static void main(String[] args)
		  {
		    int[][] matrix={{1,2,3},{4,3,5},{7,8,9}};
		    int target=2;
		    int target2=10; 
		    System.out.println("element found "+target+";"+search(matrix,target));
		    System.out.println("element found "+target+";"+search(matrix,target2));
		    
		  }
}

