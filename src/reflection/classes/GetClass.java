package reflection.classes;

import reflection.ConcreteClass;

/**
 * We can get Class of an object using three methods – through static variable
 * class, using getClass() method of object and java.lang.Class.forName(String
 * fullyClassifiedClassName). For primitive types and arrays, we can use static
 * variable class. Wrapper classes provide another static variable TYPE to get
 * the class.
 * 
 * @author rgederin
 * 
 */
public class GetClass {
	public static void main(String[] args) {
		// Get Class using reflection
		Class<?> concreteClass = ConcreteClass.class;
		concreteClass = new ConcreteClass(5).getClass();

		try {
			// below method is used most of the times in frameworks like JUnit
			// Spring dependency injection, Tomcat web container
			// Eclipse auto completion of method names, hibernate, Struts2 etc.
			// because ConcreteClass is not available at compile time
			concreteClass = Class.forName("reflection.ConcreteClass");

			System.out.println(concreteClass.getCanonicalName()); // prints
																	// reflection.ConcreteClass

			// for primitive types, wrapper classes and arrays
			Class<?> booleanClass = boolean.class;
			System.out.println(booleanClass.getCanonicalName()); // prints
																	// boolean

			Class<?> cDouble = Double.TYPE;
			System.out.println(cDouble.getCanonicalName()); // prints double

			Class<?> cDoubleArray = Class.forName("[D");
			System.out.println(cDoubleArray.getCanonicalName()); // prints
																	// double[]

			Class<?> twoDStringArray = String[][].class;
			System.out.println(twoDStringArray.getCanonicalName()); // prints
																	// java.lang.String[][]
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
