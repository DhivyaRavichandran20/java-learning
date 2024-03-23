	public class demo{
		public static void main(String args[]){
			String s1 = new String("hello");
			String first = "Backend";
			String second = "Backend";
			String third = "java";
			   
			System.out.println(s1);
			System.out.println(first);   
			System.out.println(second);  
			System.out.println(third); 
			if(s1==first){
				System.out.println("both are equal");
			}else{
				System.out.println("both are not equal");
			}
			if(first==second){
				System.out.println(" both strings are equal");
			}else{
				System.out.println(" both Strings are notequal");
			}
			if(first.equals(second)){
			System.out.println("Strings first and second are equal " );
			}else{
			System.out.println("Strings first and second are not equal ");
			}

    
			if(first.equals(third)){
			System.out.println("Strings first and third are equal: " );
			}else{
			System.out.println("Strings first and third are not equal");
		}
	}
}