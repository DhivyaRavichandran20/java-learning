	import java.util.Stack;
	
		public class StackTest{
		
			public static void main(String[]args){
				Stack<Integer> stack1 = new Stack<>();
					stack1.push(10);
					stack1.push(20);
					stack1.push(30);
					stack1.push(40);
					stack1.push(50);
					
				System.out.println(stack1);
				System.out.println("peek" +stack1.peek());
				//System.out.println(stack1);
				
				//System.out.println(pop);
				System.out.println("pop" +stack1.pop());
				System.out.println(stack1);
			}
		}
				
					
			