package reflection.fields;

import java.lang.reflect.Field;

import reflection.ConcreteClass;

/**
 * We know that private fields and methods can’t be accessible outside of the
 * class but using reflection we can get/set the private field value by turning
 * off the java access check for field modifiers.
 * 
 * @author rgederin
 * 
 */
public class GetSetPrivateFieldValue {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		Field privateField = Class.forName("reflection.ConcreteClass").getDeclaredField("privateString");
		//turning off access check with below method call
		privateField.setAccessible(true);
		ConcreteClass objTest = new ConcreteClass(1);
		System.out.println(privateField.get(objTest)); // prints "private string"
		privateField.set(objTest, "private string updated");
		System.out.println(privateField.get(objTest)); //prints "private string updated"
	}
}
