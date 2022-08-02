package methods_lecture;

public class Mtd_with_parameter_practice {

	public static void main(String[] args) {
		Mtd_with_parameter_practice k3=new Mtd_with_parameter_practice(); 
		k3.k2("Rajesh","Khanna");
	}
	
	public void k2(String fname, String lname) {
		System.out.println("First_name:"+fname+" "+"Last_name:"+lname);
	}
}
