package reflection.fields;

import java.lang.reflect.Field;

public class GetFieldType {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Field field = Class.forName("reflection.ConcreteClass").getField("publicInt");
		Class<?> fieldType = field.getType();
		System.out.println(fieldType.getCanonicalName()); //prints int
	}
}
