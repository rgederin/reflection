package reflection.classes;

/**
 * getDeclaringClass() method returns the Class object representing the class in
 * which it was declared.
 * 
 * @author rgederin
 * 
 */
public class GetDeclaringClass {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> innerClass = Class
				.forName("reflection.ConcreteClass$ConcreteClassDefaultClass");
		// prints com.journaldev.reflection.ConcreteClass
		System.out.println(innerClass.getDeclaringClass().getCanonicalName());
		System.out.println(innerClass.getEnclosingClass().getCanonicalName());

	}

}
