	public class sumofnaturalnumbers{
		public static void main(String args[]){
			int n = 10;
			int sum =0;
			if(n<1){
				System.out.println("the number is less than zero");
			}else{
				int i=1;
				while( i <= n){
					sum += i;
					i++;
				}
			}
				System.out.println("Sum of natural numbers from 1 to"+ n +":" + sum );
		}
	}
				