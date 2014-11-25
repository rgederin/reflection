package reflection.fields;

import java.lang.reflect.Field;

import reflection.ConcreteClass;

/**
 * We can get and set the value of a field in an Object using reflection.v
 * 
 * get() method return Object, so if field is primitive type, it returns the
 * corresponsing Wrapper Class. If the field is static, we can pass Object as
 * null in get() method.
 * 
 * There are several set*() methods to set Object to the field or set different
 * types of primitive types to the field. We can get the type of field and then
 * invoke correct function to set the field value correctly. If the field is
 * final, the set() methods throw java.lang.IllegalAccessException.
 * 
 * @author rgederin
 * 
 */
public class GetSetPublicFieldValue {

	public static void main(String[] args) throws NoSuchFieldException,
			SecurityException, ClassNotFoundException,
			IllegalArgumentException, IllegalAccessException {
		Field field = Class.forName("reflection.ConcreteClass").getField(
				"publicInt");
		ConcreteClass obj = new ConcreteClass(5);
		System.out.println(field.get(obj)); // prints 5
		field.setInt(obj, 10); // setting field value to 10 in object
		System.out.println(field.get(obj)); // prints 10
	}
}
