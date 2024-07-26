
public class GettersAndSetters {

		private String Name;
		private int Age;
		private float Fee;
		private String Emailid;
		public GettersAndSetters(String Name,int Age,float Fee,String Emailid)
		{
			this.Name=Name;
			this.Age=Age;
			this.Fee=Fee;
			this.Emailid=Emailid;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		public float getFee() {
			return Fee;
		}
		public void setFee(float fee) {
			Fee = fee;
		}
		public String getEmailid() {
			return Emailid;
		}
		public void setEmailid(String emailid) {
			Emailid = emailid;
		}
       public static void main(String[] args)
       {
    	   GettersAndSetters gs=new GettersAndSetters("saikiran",21,21000,"saijakkula021@gmai.com");
    			   System.out.println(gs.getName());
    			   System.out.println(gs.setName("revature"));
    			   System.out.println(gs.getName());
	}

}
