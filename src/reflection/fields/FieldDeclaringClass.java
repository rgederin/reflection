package reflection.fields;

import java.lang.reflect.Field;

/**
 * We can use getDeclaringClass() of field object to get the class declaring the
 * fiel
 * 
 * @author rgederin
 * 
 */
public class FieldDeclaringClass {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Field field = Class.forName("reflection.ConcreteClass").getField(
					"interfaceInt");
			Class<?> fieldClass = field.getDeclaringClass();
			System.out.println(fieldClass.getCanonicalName()); // prints
																// creflection.BaseInterface
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}

}
