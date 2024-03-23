	class vehicle {
		int wheel = 0;
		string color = "red";
		
		public vehicle(){
			this.wheel = w;
			this.color = c;
		}
		public void print(){
			System.out.println("wheel is " + this.wheel + " color is" + this.color);
		}
		
	public class Test{
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

