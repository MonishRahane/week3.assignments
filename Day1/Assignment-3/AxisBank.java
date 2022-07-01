package week3.day1.assignments;

public class AxisBank extends BankInfo{
	
	//Overriding method deposit
	public int deposit() {
		return 1200000;
	}
	public static void main(String[] args) {
		
		//Creating object for class AxisBank 
		AxisBank obj = new AxisBank();
		
		//Accessing all methods 
		System.out.println("Fixed: " + obj.fixed());
		System.out.println("Savings: " + obj.savings());
		System.out.println("Deposit: " + obj.deposit());;
	}
}
