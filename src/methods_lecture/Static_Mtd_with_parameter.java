package methods_lecture;

public class Static_Mtd_with_parameter {
	
public static void m1(int a, int b){
	System.out.println(a+b);
}


public void m2(int c, int d) {
		
		System.out.println(c*d);
	}

public static void main(String[] args) {
	m1(100,150);
	Static_Mtd_with_parameter multi=new Static_Mtd_with_parameter();   // object creation
	multi.m2(15,25);     //mtd (non static regular mtd with parameter) called in main mtd of same class
	Mtd_with_parameter_called_from_diff_class.subtract(50,40);
	Mtd_with_parameter_called_from_diff_class div=new Mtd_with_parameter_called_from_diff_class();
	div.division(24,5);
	div.division(75,4);
	multi.m2(25,26);
	m1(2500,1500);
	multi.m2(11,13);
	Mtd_with_parameter_called_from_diff_class.subtract(1,5);
}
}


