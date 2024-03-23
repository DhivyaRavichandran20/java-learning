	import java.util.EnumSet;
	
	public class Enumdemo{
		
	enum Direction{
		
		NORTH(5),SOUTH(10),WEST(15),EAST(20);
		
		private int value;
		
		private Direction(int value){
			this.value = value;
		}
		
		//static final EnumSet<Direction> some = Enumset.of(NORTH,SOUTH);
		//static final EnumSet<Direction> somee = EnumSet.of(WEST,EAST);
	}
	
	public static void main(String[]args){
		Direction direction = Direction.EAST;
		System.out.println("value of" + " " + direction + " " + "is" + " " + direction.value);
		
		switch(direction){
			case NORTH:
				System.out.println("Direction is NORTH");
				break;
			case SOUTH:
				System.out.println("Direction is SOUTH");
				break;
			case WEST:
				System.out.println("Direction is WEST");
				break;
			case EAST:
				System.out.println("Direction is EAST");
				break;
			default:
				System.out.println(" Invalid direction");
		}
			
		
		int index = Direction.NORTH.ordinal();
		System.out.println(index);
		
		for(Direction directionn : Direction.values()){
			System.out.println(directionn + " " + directionn.value);
		}
	}
}
	