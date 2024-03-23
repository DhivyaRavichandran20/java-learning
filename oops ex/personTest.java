	class person{
		
		String name;
		int age;
		
		
		public person(){
			System.out.println("print no args constructor");
		}
		
		public person(String n,int a){
			
			this.name = n;
			this.age = a;
			System.out.println(" print arguement constructor");
		} 
		public String toString(){
			return this.name+ " " +this.age;
		}
		
		//public void personmethod(){
		//	System.out.println(" print method");
		//}
	}
		
	public class personTest{
	
		public static void main(String[]args){
		
			person p = new person();
		    System.out.println("person is "+ p);
		
			person p1 = new person("Dhivya",20);
			System.out.println("person is "+ p1);
		
		   // personmethod();
		}
	}
		