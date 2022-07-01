package week3.day1.assignments;

public class Students {
	
	//Creating getStudentinfo methods using different argument
	public void getStudentinfo(int id) {
		System.out.println("Id: "+ id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Id: " + id +", "+"Name: " + name);
	}
	public void getStudentInfo(String email, long phnNo) {
		System.out.println("Email: " + email + ", " + "Phone Number: " + phnNo);
	}
	public static void main(String[] args) {
		
		//Creating object for class students
		Students obj = new Students();
		
		//Accessing all created methods using object
		obj.getStudentinfo(22);
		obj.getStudentInfo(22, "Hinata");
		obj.getStudentInfo("HinataHyuga07@gmail.com", 952207310L);
	}
}
