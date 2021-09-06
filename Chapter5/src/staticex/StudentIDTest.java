package staticex;

public class StudentIDTest {

	public static void main(String[] args) {
		
		
		Student studentLee=  new Student("LEE");
//		System.out.println(studentLee.getSerialNum());
		
		Student studentKim = new Student("KIM");
//		System.out.println(Student.getSerialNum());
//		System.out.println(Student.getSerialNum());
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
	}

}
