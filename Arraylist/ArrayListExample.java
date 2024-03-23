	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	class ArrayListExample {
	
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
			
			for(int i = 0; i < arr1.size(); i++){
                System.out.println("normal for loop " +arr1.get(i));
            }

            for(Integer i : arr1){
                System.out.println("for each loop "+i);
            }
			List<Integer> arr3 = Arrays.asList(1,2,3);
			arr3.addAll(arr3);
			System.out.println(arr3);
		}
	}