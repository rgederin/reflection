package reflection.classes;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * getConstructors() method returns the list of public constructors of the class
 * reference of object.
 * 
 * @author rgederin
 * 
 */
public class GetAllPublicConstructors {
	public static void main(String[] args) throws SecurityException,
			ClassNotFoundException {
		// Get All public constructors
		Constructor<?>[] publicConstructors = Class.forName(
				"reflection.ConcreteClass").getConstructors();
		// prints public constructors of ConcreteClass
		System.out.println(Arrays.toString(publicConstructors));
	}
}
