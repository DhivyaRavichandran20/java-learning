	 class vehicle{
		  
		// instance variable
		int wheel;
		String color;
		
		//class variable
		public static String type;
		
		
		public vehicle(){
			this.wheel = 4;
			this.color = "red";
		}
		public vehicle(int wheel,String color){
			this.wheel = wheel;
			this.color = color;
		}
		
		
		public void move(){
			System.out.println("wheel" + wheel +"color" + color);
		}
		
		public String toString(){
			return this.wheel + " " + this.color;
		}
	 }
		
		
		public class objectclassf{
			public static void main(String args[]){
				vehicle v1 = new vehicle();
				vehicle v2 = new vehicle(6,"green");
				vehicle.type = "car";
				System.out.println(vehicle.type);
				System.out.println("v1 is" + v1);
				System.out.println("v2 is" + v2);
				
			}
		}
	 
			