	import java.util.*;
	
		public class exercise2{
			public static void main(String[]args){
				
				Map<Integer,String> hs = new HashMap<>();
				Map<Integer,String> hs1 = new HashMap<>();
				
				hs.put(10,"red");
				hs.put(22,"green");
				hs.put(3,"blue");
				
				System.out.println(" values in first map : " + hs);
				
				hs1.put(5,"black");
				hs1.put(4,"white");
				hs1.put(66,"orange");
				
				System.out.println(" values in second map : " + hs1);
				
				hs1.putAll(hs);
				System.out.println(" now values in second map : " + hs1);
			}
		}
				
				
				