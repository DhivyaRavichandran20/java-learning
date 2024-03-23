import java.util.ArrayList;
import java.util.List;
	class animal{
		
		private int type = 1;
		private String name = " lion ";
		
	public animal(int t,String n){
		this.type = t;
		this.name = n;
	}
	public int getType(){
		return type;
	}
	public void setType(int type){
		this.type = type;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		this.name = n;
	}
	public String toString(){
		return this.type+ "" +this.name;
	}
}
	public class ArrayListTestdemo{
		
		public static void main(String[]args){
			
			List<animal> animalList = new ArrayList<>();
			
			animal a1 = new animal(2,"tiger");
			animal a2 = new animal(3,"cheetah");
			
			animalList.add(a1);
			animalList.add(a2);
			
			System.out.println(animalList);
			
			animal v3 = animalList.get(0);
			v3.setType(10);
			System.out.println(animalList);
			System.out.println(v3);
			System.out.println(v3==a1);
			System.out.println(v3==a2);
			System.out.println(v3.equals(a2));
			System.out.println(v3.equals(a1));
		}
	}
			
	