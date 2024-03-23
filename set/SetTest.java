	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.TreeSet;
	
		public class SetTest{
			public static void main(String[]args){
			
				List<Integer> intList = new ArrayList<>();
				
				intList.add(100);
				intList.add(10);
				intList.add(10);
				intList.add(10);
				intList.add(10);
				intList.add(20);
				
				System.out.println("Duplicate list is" + intList);
				
				Set<Integer> setInt = new HashSet<>(intList);
				Set<Integer> linkedHashSet = new LinkedHashSet<>(intList);
				Set<Integer> treeSet = new TreeSet<>(intList);
				/*setInt.add(1);
				setInt.add(1);
				setInt.add(1);
				setInt.add(100);
				setInt.add(200);*/
				
				System.out.println("Hash set is " + setInt);
				System.out.println("Linked Hash set is " +linkedHashSet);
				System.out.println(" Tree set is " + treeSet);
				
				List<Integer> uniqueList = new ArrayList<>(setInt);
				System.out.println(" unique List is " + uniqueList);
				
				for(Integer i : setInt)
					System.out.println("values" + i);
				
				/*Set<Student> studentset = new HashSet<>();
				
				Student s1 = new Student(1,"dhivya");
				Student s2 = new Student(1,"dhivya");
				Student s3 = new Student(1,"dhivya");
				
				studentset.add(s1);
				studentset.add(s2);
				studentset.add(s3);
				
				System.out.println(" Student set is " + studentset);*/
			}
			
		}
				
			
		
				