	class Employee{
		
		String Name;
		String job_title;
		private int Salary;
		
	public Employee(String Name,String job_title,int Salary){
		this.Name = Name;
		this.job_title = job_title;
		this.Salary = Salary;
	}
	public int getSalary(){
		return Salary;
	}
	//public void setSalary(int Salary){
		//return this.Salary = Salary;
	//}
	//public int calculateSalary(int salarypercentage){
	//	return Salary * ( salarypercentage/100);
	//}
	public void updateSalary(int  percentageIncrease){
		int IncreaseAmount = Salary * ( percentageIncrease/100);
		Salary += IncreaseAmount;
		System.out.println(Name + " ' s salary updated to: $" + salary);
	}
}
		
		
	public class exercise5{
		public static void main(String[]args){
		
			Employee employee = new Employee("Dhivya" , ""," software developer ", 100000);
			System.out.println("Employee Details:");
			System.out.println("Name:" + employee.getSalary());
			
			//int salary = employee.calculateSalary(10);
			System.out.println("Salary:$" + employee.getSalary());
			
			employee.updateSalary(10);
		}
	}