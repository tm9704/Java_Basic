package selfcheck1;

public class Person {
	int height;
	int weight;
	String name;
	int age;
	
	public Person(int height, int weight, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
	}
	
	public void showPersonInfo() {
		System.out.println("키가 " + height + "이고 몸무게가 " + weight + "킬로인 남성이 있습니다. 이름은 " + name +
				"이고 나이는 " + age + " 입니다.");
	}
}
