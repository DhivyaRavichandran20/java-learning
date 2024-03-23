	
	import java.util.function.Predicate;
	import java.util.function.Consumer;
	import java.util.function.Supplier;
	import java.util.function.Function;
	import java.util.function.BiFunction;
	
	interface funcInterface{
		
		void print(int x);
	}
	
	interface addInterface{
		
		void add (int a,int b);
	}
	
	/*class subclass implements funcInterface{
		public void print(int x){
			System.out.println(" val s" + " "+ (2*x));
		}*/
	
	//}
	public class lambdaTest{
		public static void main(String[]args){
		
		//subclass s = new subclass();
		//s.print(5);
		//System.out.println("val is" + s);
		
		funcInterface fobj = (int x) -> System.out.println(2*x);
		fobj.print(10);
		
		addInterface aobj = (int a,int b) -> System.out.println( a+b);
		aobj.add(10,20);
		
		Predicate<String> p = (x) -> x.equals("test");
		System.out.println(p.test("test123"));
		
		Consumer<Integer> conObj = (x) -> System.out.println("value of x is " + x);
		conObj.accept(20);
		
		Supplier<String> suppobj = () -> "hello";
		System.out.println(suppobj.get()); 
		
		Function<Integer, Integer> funcObj = (x) -> x*x;
		System.out.println(funcObj.apply(10));
		
		BiFunction<Integer,Integer,Integer> bifunc = (x,y) -> x*y;
		System.out.println(bifunc .apply(10,30));
		
	}
}