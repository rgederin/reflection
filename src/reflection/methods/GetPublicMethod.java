package reflection.methods;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * We can use getMethod() to get a public method of class, we need to pass the
 * method name and parameter types of the method. If the method is not found in
 * the class, reflection API looks for the method in superclass.
 * 
 * In below example, I am getting put() method of HashMap using reflection. The
 * example also shows how to get the parameter types, method modifiers and
 * return type of a method.
 * 
 * @author rgederin
 * 
 */
public class GetPublicMethod {
	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException, ClassNotFoundException {
		Method method = Class.forName("java.util.HashMap").getMethod("put",
				Object.class, Object.class);
		// get method parameter types, prints
		// "[class java.lang.Object, class java.lang.Object]"
		System.out.println(Arrays.toString(method.getParameterTypes()));
		// get method return type, return "class java.lang.Object", class
		// reference for void
		System.out.println(method.getReturnType());
		// get method modifiers
		System.out.println(Modifier.toString(method.getModifiers())); // prints
																		// "public"
	}
}
