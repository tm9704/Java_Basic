package reference;

public class Student {
	int studentID;
	String studentname;
	
	Subject korea;
	Subject english;
	Subject math;
	
	public Student(int id, String name) {
		studentID = id;
		studentname = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score){
		math.subjectName = name;
		math.score = score;
	}
	
	//메소드의 코드가 동일하니까 메서드를 따로 만들어서 호출시켜도 됨.
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentname + "학생의 총점은 :" + total + "점 입니다.");
	}
}
