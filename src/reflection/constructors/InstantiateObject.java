package reflection.constructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

/**
 * We can use newInstance() method on the constructor object to instantiate a
 * new instance of the class. Since we use reflection when we don’t have the
 * classes information at compile time, we can assign it to Object and then
 * further use reflection to access it’s fields and invoke it’s methods.
 * 
 * @author rgederin
 * 
 */
public class InstantiateObject {
	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException, ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		Constructor<?> constructor = Class.forName("reflection.ConcreteClass")
				.getConstructor(int.class);
		// getting constructor parameters
		System.out.println(Arrays.toString(constructor.getParameterTypes())); // prints
																				// "[int]"

		Object myObj = constructor.newInstance(10);
		Method myObjMethod = myObj.getClass().getMethod("method1", null);
		myObjMethod.invoke(myObj, null); // prints "Method1 impl."

		Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap")
				.getConstructor(null);
		System.out.println(Arrays.toString(hashMapConstructor
				.getParameterTypes())); // prints "[]"
		HashMap<String, String> myMap = (HashMap<String, String>) hashMapConstructor
				.newInstance(null);
	}
}
