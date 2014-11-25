package reflection.classes;

import java.lang.reflect.Method;


/**
 * getMethods() method returns the array of public methods of the Class
 * including public methods of it’s superclasses and super interfaces.
 * 
 * @author rgederin
 * 
 */
public class GetAllPublicMethods {

	public static void main(String[] args) throws SecurityException,
			ClassNotFoundException {
		Method[] publicMethods = Class.forName("reflection.ConcreteClass")
				.getMethods();
		// prints public methods of ConcreteClass, BaseClass, Object
		for (Method method : publicMethods) {
			System.out.println(method);
		}
		// System.out.println(Arrays.toString(publicMethods));
	}

}
