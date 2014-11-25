package reflection.constructors;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * We can use getConstructor() method on the class representation of object to
 * get specific public constructor. Below example shows how to get the
 * constructor of ConcreteClass defined above and the no-argument constructor of
 * HashMap. It also shows how to get the array of parameter types for the
 * constructor.
 * 
 * @author rgederin
 * 
 */
public class GetPublicConstructor {

	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException, ClassNotFoundException {
		Constructor<?> constructor = Class.forName("reflection.ConcreteClass")
				.getConstructor(int.class);
		// getting constructor parameters
		System.out.println(Arrays.toString(constructor.getParameterTypes())); // prints
																				// "[int]"

		Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap")
				.getConstructor(null);
		System.out.println(Arrays.toString(hashMapConstructor
				.getParameterTypes())); // prints "[]"
	}

}
