		class dog {
		
			private String name;
			private String breed;
			
		public dog(String name,String breed){
			this.name = name;
			this.breed = breed;
		}
		
		public void setName(String name){
			this.name = name;
		}
		public void setBreed(String breed){
			this.breed = breed;
		}
		public String getName(){
			return 	name;
		}
		public String getBreed(){
			return 	breed;
		}
	}
	
	public class exercise2{
	
		public static void main(String[]args){
		
			dog dog1 = new dog("buddy","Labrador");
			
			dog dog2 = new dog("max","Golden Retriever");
			
			System.out.println("dog 1: name - " + dog1.getName() + ",Breed - " + dog1.getBreed());
			
			System.out.println("dog 2: name - " + dog2.getName() + ",Breed - " + dog2.getBreed());
			
			dog1.setName("charlie");
			dog1.setBreed("dachshund");
			
			System.out.println("\n updated values: ");
			
			System.out.println("dog 1: name - " + dog1.getName() + ",Breed - " + dog1.getBreed());
			
			System.out.println("dog 2: name - " + dog2.getName() + ",Breed - " + dog2.getBreed());
			
		}
		
	}
			
			
			
			
			
	
	
			
			
			
		