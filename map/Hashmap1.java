import java.util.HashMap;
import java.util.Map;
	
	public class Hashmap1{
		
		public static void main(String args[]){
			
			Map<Integer,String> map1 = new HashMap<>();
			
			map1.put(44,"surekaa");
			map1.put(8,"Dhivya");
			map1.put(36,"sandhiya");
			map1.put(61,"sowmiya");
			
			String name =  map1.get(8);
			System.out.println(map1);
			
			for(Integer k : map1.keySet()){
				System.out.println("key is " + k);
			}
			
			for(Map.Entry<Integer,String> entry : map1.entrySet()){
			 System.out.println("key is" + entry.getKey() + "value is" + entry.getValue());
			}
			for(String s : map1.values()){
				System.out.println(" value is " + s);
			}
		}
	}