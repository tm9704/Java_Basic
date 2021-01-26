package array;

public class StudentTest {

	//이것만 두고 이클립스의 도움을 받아서 나머지를 채워보자
	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 90);
		studentKim.addSubject("영어", 80);
		
		studentLee.showStudentInfo();
		System.out.println("=================");
		studentKim.showStudentInfo();
	}

}
