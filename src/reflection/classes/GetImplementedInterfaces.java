package reflection.classes;

import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * getGenericInterfaces() method returns the array of interfaces implemented by
 * the class with generic type information. We can also use getInterfaces() to
 * get the class representation of all the implemented interfaces
 * 
 * @author rgederin
 * 
 */
public class GetImplementedInterfaces {
	public static void main(String[] args) throws ClassNotFoundException {
		Type[] interfaces = Class.forName("java.util.HashMap")
				.getGenericInterfaces();
		// prints "1"
		System.out.println(Arrays.toString(interfaces));
		// prints
		// "[interface java.util.Map, interface java.lang.Cloneable, interface java.io.Serializable]"
		System.out.println(Arrays.toString(Class.forName("java.util.HashMap")
				.getInterfaces()));
	}
}
