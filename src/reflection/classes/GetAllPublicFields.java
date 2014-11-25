package reflection.classes;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * getFields() method returns the array of public fields of the class including
 * public fields of it’s super classes and super interfaces.
 * 
 * @author rgederin
 * 
 */
public class GetAllPublicFields {
	public static void main(String[] args) throws SecurityException,
			ClassNotFoundException {
		// Get All public fields
		Field[] publicFields = Class.forName("reflection.ConcreteClass")
				.getFields();
		// prints public fields of ConcreteClass, it's superclass and super
		// interfaces
		System.out.println(Arrays.toString(publicFields));
	}
}
