	class vehicle {
		int wheel ;
		string color ;
		
		public vehicle(){
			wheel = w;
		    color = c;
		}
		public void print(){
			System.out.println("wheel is " + this.wheel + " color is" + this.color);
		}
		
	public class Testt{
		public static void main(String[]args){
		vehicle v1 = new vehicle();
		vehicle v2 = new vehicle();
		System.out.println("v1 is " + v1);
		v1.print();
		System.out.println("v2 is " + v2);
		v2.print();
		}
	}
}

