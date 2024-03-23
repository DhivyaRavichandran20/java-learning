	class vehicle{
	
		private int wheel;
		private String color;
		
		public int getWheel(){
			return wheel;
		}
		
		public void setWheel(int wheel){
			this.wheel = wheel;
		}
		
		public String getColor(){
			return color;
		}
		
		public void setColor(String color){
			if(wheel > 4)
				this.color = color;
		}
		public String toString(){
			return this.wheel + " " + this.color;
		}
	}
	
	public class encapsulation{
		
		public static void main(String args[]){
			
			vehicle v = new vehicle();
			v.setWheel(5);
			v.setColor("red");
			v.getColor();
			v.getWheel();
			System.out.println(v);
		}
	}
		
		