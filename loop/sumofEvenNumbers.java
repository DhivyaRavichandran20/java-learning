	public class sumofEvenNumbers{
		public static void main(String args[]){
			int n = 10;
			int sum = 0;
			if (n < 1){
				System.out.println("please enter a +ve number greater than 0");
			} else{
				for(int x=2;x<=n;x++){
					if(x%2==0){
						sum += x;
					}
				}
			}
				System.out.println(" sum of even numbers from 1 to "+ n + ":"+sum);
		}
	}