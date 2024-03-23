	import java.util.Map;
	import java.util.TreeMap;
	
		public class treemap{
			public static void main(String[]args){
				Map<String,Integer> treemap = new TreeMap<>();
				treemap.put("A",1);
				treemap.put("C",25);
				treemap.put("B",12);
				treemap.put("D",27);
				treemap.put("X",56);
				int valueA = treemap.get("X");
				System.out.println(" value of X:"+ valueA);
				System.out.println(" value is"+treemap);
			}
		}
				
				