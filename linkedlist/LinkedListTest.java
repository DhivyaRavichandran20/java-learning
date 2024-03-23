import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

	public class LinkedListTest{
		public static void main(String[]args){
			List<Integer> linkedlist = new LinkedList<>();
			linkedlist.add(1);
			linkedlist.add(2);
			linkedlist.add(0,3);
			System.out.println(linkedlist);
			linkedlist.set(2,100);
			System.out.println(linkedlist);
		}
	}
			
			
			