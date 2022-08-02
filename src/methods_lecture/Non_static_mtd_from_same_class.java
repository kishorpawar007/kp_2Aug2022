package methods_lecture;

public class Non_static_mtd_from_same_class {
	
	public static void main(String[] args) {
		Non_static_mtd_from_same_class o1=new Non_static_mtd_from_same_class();     // object creation
		o1.m1();           // Non static mtd called in main method
		
		Non_static_mtd_from_diff_class o2=new Non_static_mtd_from_diff_class();     // non static mtd from diff class: 1
		o2.m2();                // 2nd step calling non static mtd from diff class in main mtd of diff class.
		
	}

	public void m1() {
		
		System.out.println("I am working in Tata Motors.");
	}
}
