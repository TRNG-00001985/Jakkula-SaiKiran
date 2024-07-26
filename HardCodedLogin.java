import java.util.Scanner;

public class HardCodedLogin {

	public static void main(String[] args) {
		String username="Sai kiran";
		String password="123456789";
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enetr User Name : ");
		String enterusername=sc.nextLine();
		
		System.out.println("Enter PassWord : ");
		String enterpassword=sc.nextLine();
		
		if (username.equals(enterusername)  &&  password.equals(enterpassword) ) 
		{
			System.out.println("Login successfull");
		}
		else {
			System.out.println("Login failed ");
			
			
		}
		

	}

}
