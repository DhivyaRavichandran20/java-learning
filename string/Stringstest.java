	import java.io.*;
		public class Stringstest{
		
			public static void main(String args[]){
			
			String s = new String("hello");
			String s1 = "HellO";
			String s2 = "  hello";
			System.out.println(s2 . concat ("world"));
			System.out.println("Memory" + " " +(s == s1));
			System.out.println("value" + " " + s .equals(s1));
			System.out.println(s1.equalsIgnoreCase(s2));
			System.out.println(s1.equals(s2));
			System.out.println(s.equals(s2));
			System.out.println(s2.toUpperCase());
			System.out.println(s1.toLowerCase());
			//System.out.println(s1.replace(oldChar:'e',newChar:'s'));
			System.out.println(s2.trim());
			System.out.println(s1.split("e"));
			
			
			for(int i = 0; i < s1.length(); i++){
				System.out.println(s1.charAt(i));
			}
			
			/*for(int i = 0; i < s.length(); i++){
				arr[i] = s.charAt(i);
			}*/
			
			char[] arr = s1.toCharArray();
			 
            System.out.println(arr);
			
			 
 }  
			
		}
	} 