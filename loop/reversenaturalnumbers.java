	public class reversenaturalnumbers{
		public static void main(String args[]){
			int n = 0;
			if (n < 1){
				System.out.println(" Number is less than zero");
			} else {
				System.out.println("Natural numbers in reverse from" + n + " to 1:");
				int i = 0;
				for(int x=n;x>=1;x--){
				System.out.print(x);
				}
			}
		}
	}
	