	import java.util.*;
		
		public class exercise4{
			
			public static void main(String[]args){
				List<String> liststr = new ArrayList<String>();
				
				liststr.add("red");
				liststr.add("green");
				liststr.add("blue");
				liststr.add("grey");
				liststr.add("black");
				
				System.out.println("list before shuffling:\n " + liststr);
				Collections.shuffle(liststr);
				System.out.println("list after shuffling:\n " + liststr);
			}
		}
				
			