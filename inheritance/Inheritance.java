	class animal{
		
		public int legs = 4;
		public String color = "black";
		
		public animal(){
			System.out.println("animal constructor");
		}
		public animal(int l, String c){
			this.legs = l;
			this.color = c;
			System.out.println("parent parameter constructor");
		}
		public void displayanimal(){
			System.out.println("parent" + this.legs + " " + this.color);
		}
		public String toString(){
			return this.legs + " " + this.color;
		}
	}
	class lion extends animal{

			String jump = "fast";
		
		public lion(){
			System.out.println("lion constructor");
		}
		
		public lion(int legs,String color,String j){
			 super(legs, color);

			this.jump = j;
			System.out.println("Child Param Constructor " + this.jump);
    }
		public void display() {
			System.out.println("child ");
    }

		public void displayLion() {
			System.out.println("child lion");
    }
}
	class cheetah extends lion{

		String shout = "high";
		
		public cheetah(){
			System.out.println("lion constructor");
		}
		
		public cheetah(int legs,String color,String j,String s){
			super(legs, color,j);

			this.shout = s;
			System.out.println("Child Param Constructor " + this.shout);
		}
		
		public void displaycheetah() {
			System.out.println("child cheetah");
		}
	}
	
	public class Inheritance {
    
	
		public static void main(String[] args) {
			
			animal A = new animal();
			System.out.println(A);

			lion l = new lion(4," yellow" ,"fast");
			System.out.println(l);

			A.displayanimal();
			l.displayLion();

			//c.displaycheetah();

			cheetah c = new cheetah(4, "yellow & black" ,"fast", " high");
			System.out.println(c);

    }
}


			