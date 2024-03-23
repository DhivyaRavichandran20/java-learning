	class Rectangle{
	
		int height;
		int width;
	
	public Rectangle(int height,int width){
		this.height = height;
		this.width = width;
	}
	public int calculateArea(){
		return height*width;
	}
	public int calculatePerimeter(){
		return 2*(height + width);
	}
}
	public class exercise3{
		public static void main(String[]args){
			Rectangle rectangle = new Rectangle(5,7);
			
			int area = rectangle.calculateArea();
			System.out.println("Area of the Rectangle:" + area);
			
			int perimeter = rectangle.calculatePerimeter();
			System.out.println("Perimeter of the Rectangle :" + perimeter);
		}
	}
			
	
	