package reflection.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * We can use getDeclaredMethod() to get the private method and then turn off
 * the access check to invoke it, below example shows how we can invoke
 * method3() of BaseClass that is static and have no parameters.
 * 
 * @author rgederin
 * 
 */
public class InvokingPrivateMethods {
	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException, ClassNotFoundException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// invoking private method
		Method method = Class.forName("reflection.BaseClass")
				.getDeclaredMethod("method3", null);
		method.setAccessible(true);
		method.invoke(null, null); // prints "Method3"
	}
}
