		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.List;
			
			public class ArrayList3 {
	
				public static void main(String[]args){
			
					int n=5;
					List<Integer> arr1 = new ArrayList<>();
					//list<Integer> arr2 = new ArrayList<>();
					arr1.add(10);
					arr1.add(20);
					System.out.println(arr1);
					arr1.add(0,100);
					System.out.println(arr1);
					arr1.set(0,200);
					System.out.println(arr1);
					
					if (arr1.contains(20)){
					System.out.println("Found the element");
		        }
					else{
					System.out.println("There is no such element");
				}
			}
		}