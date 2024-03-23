	import java.util.EnumSet;
	
	enum days{
		
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
		
		 	//static final EnumSet<days> weekend = EnumSet.range(days.SATURDAY,days.SUNDAY);
		 	//static final EnumSet<days> weekdays = EnumSet.of(days.MONDAY,days.TUESDAY,days.WEDNESDAY,days.THURSDAY,days.FRIDAY);
			
	}
	
	public class EnumSetdemo{
		
		public static void main(String[]args){
			
			 EnumSet<days> weekend = EnumSet.range(days.SATURDAY,days.SUNDAY);
			 EnumSet<days> weekdays = EnumSet.of(days.MONDAY,days.TUESDAY,days.WEDNESDAY,days.THURSDAY,days.FRIDAY);
			
			System.out.println("Weekend:" + " " + weekend);
			System.out.println("Weekdays:" + " " + weekdays);
		}
	}
			