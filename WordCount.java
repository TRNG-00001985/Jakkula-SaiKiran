
public class WordCount {
	public static void main(String[] args)
	{
		String str="i am an employee at revature";
	   if(str==null || str.isEmpty())
	   {
		   System.out.println("0");
	   }
	   else
	   {
		   String[] word= str.trim().split(" ");
		   System.out.println(word.length);
	   }
	}

}
