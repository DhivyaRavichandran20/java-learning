	abstract class Bike{
		abstract void run();
	}
	
	class honda extends Bike{
		void run(){
		
			System.out.println(" Running safely");
			
		}
		
	}
	
	class hero extends Bike{
		void run(){
			System.out.println(" running safelyy");
		}
		
	}
	
	class service{
		
		public static void Bikeservice( Bike obj){
			System.out.println(" service method ");
			obj.run();
		}
		
	}
	class main{
		public static void main(String args[]){
		
			Bike obj = new honda();
			obj.run();
			
			obj = new hero();
			obj.run();
			
			honda h = new honda();
			h.run();
			
			hero he = new hero();
			he.run();
			
			service.Bikeservice(he);
			
		}
	}