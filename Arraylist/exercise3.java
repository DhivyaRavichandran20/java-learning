	import java.util.*;
		
		public class exercise3{
			
			public static void main(String[]args){
				List<String> list = new ArrayList<String>();
				
				list.add("1");
				list.add("2");
				list.add("3");
				list.add("4");
				
				System.out.println("list: " + list);
				
				List<String> list1 = new ArrayList<>();
				
				list1.add("A");
				list1.add("B");
				list1.add("C");
				list1.add("D");
				
				System.out.println("list1: " + list1);
				
				Collections.copy(list,list1);
				System.out.println("copy list to list1,\n After copy:");
				System.out.println("list: " + list);
				System.out.println("list1: " + list1);
			}
		}