import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
	
	public class linkedhashmap{
		
		public static void main(String args[]){
			
			Map<Integer,String> linkedmap1 = new LinkedHashMap<>();
			linkedmap1.put(44,"surekaa");
			linkedmap1.put(8,"Dhivya");
			linkedmap1.put(36,"sandhiya");
			linkedmap1.put(61,"sowmiya");
			
			String name =  linkedmap1.get(8);
			System.out.println(name);
			System.out.println(linkedmap1);
			
			for(Integer k : linkedmap1.keySet()){
				System.out.println("key is " + k);
			}
			
			for(Map.Entry<Integer,String> entry : linkedmap1.entrySet()){
			 System.out.println("key is" + entry.getKey() + "value is" + entry.getValue());
			}
			for(String s : linkedmap1.values()){
				System.out.println(" value is " + s);
			}
		}
	}