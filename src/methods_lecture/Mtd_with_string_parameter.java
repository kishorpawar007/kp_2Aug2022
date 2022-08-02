package methods_lecture;

public class Mtd_with_string_parameter {

	public static void stringwala(String name) {
		System.out.println(name);
	}
	public void fullname(String fname,String lname) {
		System.out.println(fname+" "+lname);
	}	
	public void sinfo(String name,int age,char sex, float percent) {
		System.out.println("Student Name:"+name+", Age:"+age+", Sex:"+sex+", Percentage:"+percent);
	}
	public static void main(String[] args) {
		stringwala("Rajesh");
		Mtd_with_string_parameter stringobject=new Mtd_with_string_parameter();
		stringobject.fullname("Rajesh","Singh");
		Mtd_with_string_parameter studentinfo=new Mtd_with_string_parameter();
		studentinfo.sinfo("Kishor",25,'M',74.74f);
		mtd_with_string_para_from_diff_class  studentkainfo=new mtd_with_string_para_from_diff_class ();
		studentkainfo.studentinformation("Pratik",27,'M',66.4f);
	}
}

