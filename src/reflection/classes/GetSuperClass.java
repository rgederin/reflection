package reflection.classes;

/**
 * getSuperclass() method on a Class object returns the super class of the class.
 * If this Class represents either the Object class, an interface, a primitive
 * type, or void, then null is returned. If this object represents an array
 * class then the Class object representing the Object class is returned.
 * 
 * @author rgederin
 * 
 */
public class GetSuperClass {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> superClass = Class.forName("reflection.ConcreteClass")
				.getSuperclass();
		System.out.println(superClass); // prints "class reflection.BaseClass"
		System.out.println(Object.class.getSuperclass()); // prints "null"
		System.out.println(String[][].class.getSuperclass());// prints
																// "class java.lang.Object"
	}
}
