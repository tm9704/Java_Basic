
public class Person {
	public int age;
	public String name;
	public boolean marry;
	public int child;
	
	public Person() {}
	
	public Person(int age, String name, boolean marry, int child) {
		this.age = age;
		this.name = name;
		this.marry = marry;
		this.child = child;
	}
	
	public void showPersonInfo() {
		System.out.println(age + " " + name + " " +  marry + " " + child);
	}
}
