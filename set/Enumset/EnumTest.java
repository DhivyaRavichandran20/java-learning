	import java.util.EnumSet;
	
		enum Temperature{
			low(5),
			medium(10),
			high(15),
			critical(20);
			
			private int value;
			
			Temperature( int value){
			this.value = value;
		}
			public int getValue(){
			return value;
		}
			static final EnumSet<Temperature> safeRange = EnumSet.of(low,medium);
			static final EnumSet<Temperature> highRange = EnumSet.of(high,critical);
	}
	
		public class EnumTest{
			public static void main(String[]args){
			
				Temperature temperature = Temperature.medium;
				
				for(Temperature temp : Temperature.values()){
					System.out.println(temp.getValue());
				}
				int value = 10;
				
				if(Temperature.safeRange.contains(Temperature.medium)){
					{
						System.out.println("pass");
					}
			}
		}
	}
			