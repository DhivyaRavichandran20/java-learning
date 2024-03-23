	import java.util.ArrayList;
	import java.util.List;
	
		class vehicle{
			String make;
			String model;
			int year;
			
		public vehicle(String make,String model,int year){
			this.make = make;
			this.model = model;
			this.year = year;
		}
	}
		public class exercise5{
			public static void main(String[]args){
				
				//create an instance of the class
				exercise5 exercise5 = new exercise5();
				exercise5.runProgram();
			}
			
			// non static method to run the program
			private void runProgram(){
				
			List<vehicle>vehiclelist = new ArrayList<>();
			
			vehiclelist.add(new vehicle("Toyota","camry",2020));
			vehiclelist.add(new vehicle("Ford","Mustang",2022));
			vehiclelist.add(new vehicle("Honda","civic",2021));
			vehiclelist.add(new vehicle("chevrolet","silverado",2019));
			vehiclelist.add(new vehicle("Tesla","model 3",2023));
			
			for(vehicle vehicle1: vehiclelist){
				System.out.println("Make:" + vehicle.make + ", model:" + vehicle.model + ",year:" + vehicle.year);
			}
		}
	}
		
	