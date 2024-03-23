	class Circle{
		
		private double radious;
		
		public Circle(double radious){
			this.radious = radious;
		}
		public double getRadious(){
			return radious;
		}
		public void setRadious(double radious){
			this.radious = radious;
		}
		public double calculateArea(){
			return Math.PI * Math.pow(radious,2);
		}
		public double calculateCircumference(){
			return 2 * Math.PI * radious;
		}
		
	}
	
	public class exercise4{
		public static void main(String[]args){
			Circle circle1 = new Circle(3.0);
			System.out.println("Initial radious of the circle : " + circle1.getRadious());
		
			circle1.setRadious(5.0);
			System.out.println("Modified radious of the circle : " + circle1.getRadious());
			
			double area = circle1.calculateArea();
			System.out.println(" Area of the circle: " + area);
			
			double circumference = circle1.calculateCircumference();
			System.out.println(" circumference of the circle: " + circumference);
		}
	}
			
			