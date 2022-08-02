package methods_lecture;

public class Nested_if {
public static void main(String[] args) {
	
	int sp=600;

	if(sp>=500) {
		
		System.out.println("Free delivery.");
		
		if(sp>=1500) {
			
			System.out.println("10% discount on using SBI debit card.");
		}
		else {
			System.out.println("No discount.");
		}
	}
	else {
		System.out.println("Delivery charge=25rupees.");
	}
}

	

}
