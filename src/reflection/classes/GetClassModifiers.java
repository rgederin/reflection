package reflection.classes;

import java.lang.reflect.Modifier;

/**
 * Class<?> concreteClass = Class.forName("reflection.ConcreteClass");
 * 
 * @author rgederin
 * 
 */
public class GetClassModifiers {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> concreteClass = Class.forName("reflection.ConcreteClass");
		System.out.println(Modifier.toString(concreteClass.getModifiers())); // prints
																				// "public"
		// prints "public abstract interface"
		System.out.println(Modifier.toString(Class.forName(
				"reflection.BaseInterface").getModifiers()));
	}
}
