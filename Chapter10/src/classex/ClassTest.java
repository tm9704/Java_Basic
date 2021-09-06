package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		Person person = new Person("james");
		System.out.println(person);
		
		Class c1 = Class.forName("classex.Person");
		Person person1 = (Person)c1.newInstance();
		System.out.println(person1);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"KIMYOUSIN"};
		Person personLee = (Person)cons.newInstance(initargs);
		System.out.println(personLee);
		
		
		
//		Class c2 = person.getClass();
//		Person p = (Person)c2.newInstance();
//		System.out.println(p);
//		
//		Constructor con3 = c2.getConstructor(parameterTypes);
		
	}

}
