	interface notebook{
		void read();
	}
	interface pen{
		void write();
	}
	class classmate implements notebook,pen{
		public void read(){
			System.out.println(" read classmate notebook ");
		}
		
		public void write(){
			System.out.println(" write pen");
		}
	}
	class camlin implements notebook{
		public void read(){
			System.out.println(" read camlin notebook ");
		}
		
	}
	public class Interfacedemo{
		public static void main(String[]args){
			
			classmate c = new classmate();
			c.read();
			c.write();
			
			camlin ca = new camlin();
			ca.read();
			
			notebook n = new classmate();
			n.read();
			
			pen p = new classmate();
			p.write();
			
			n = new camlin();
			n.read();
			
			Bag.things(c);
			
		}
		
	}
	
	class Bag{
		public static void things(notebook n){
			
			System.out.println(" the things carry a bag ");
			n.read();
		}
		
	}
			
			
			