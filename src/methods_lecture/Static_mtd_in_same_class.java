package methods_lecture;

public class Static_mtd_in_same_class {
	
	public static void main(String[] args) {
		
		System.out.println("My name is Kishor Pawar");
		m1();
		static_mtd_from_diff_class.m2();      // static mtd from diff class called
	}

	public static void m1() {
		
		System.out.println("I am 25 years old");
	}
}
