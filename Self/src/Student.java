
public class Student {
	public int id;
	public String name;
	public String address;
	
	public Student() {}
	
	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void showStudentInfo() {
		System.out.println("학번: " + id);
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
	}
	
}
