	//package out.production.abstraction;
	
	abstract class Bike{
		abstract void run();
		
		//public void name(){
		//System.out.println("Name");
	//}

	class Honda extends Bike{
		void run(){
			System.out.println(" Yamaha MT Bike run");
		}
	}
	
	 
	
	/*class RoyalEnfield extends Bike{
		void run(){
			System.out.println(" RoyalEnfield Bike run");
		}
	}*/

	/*class service{
		
		public static void Bikeservice( Bike b){
			System.out.println(" service method ");
			b.run();
		}
	}*/
}

	public class AbstractClass {
		public static void main(String args[]){
		
			//MT m = new MT();
			//m.run();
			
			//RoyalEnfield r = new RoyalEnfield();
			//r.run();
			
			Bike b = new Honda();
			b.run();
			
			//b = new RoyalEnfield();
			//b.run();
			
			//service.Bikeservice(m);*/
		}
	}
	