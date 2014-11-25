package reflection.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * We can use invoke() method of Method object to invoke a method, in below
 * example code I am invoking put method on HashMap using reflection.
 * 
 * @author rgederin
 * 
 */
public class InvokingPublicMethod {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = Class.forName("java.util.HashMap").getMethod("put",
				Object.class, Object.class);
		Map<String, String> hm = new HashMap<>();
		method.invoke(hm, "key", "value");
		System.out.println(hm); // prints {key=value}
	}

}
