package reflection.classes;


/**
 * getClasses() method of a Class representation of object returns an array
 * containing Class objects representing all the public classes, interfaces and
 * enums that are members of the class represented by this Class object. This
 * includes public class and interface members inherited from superclasses and
 * public class and interface members declared by the class. This method returns
 * an array of length 0 if this Class object has no public member classes or
 * interfaces or if this Class object represents a primitive type, an array
 * class, or void.
 * 
 * @author rgederin
 * 
 */
public class GetPublicMemberClasses {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> concreteClass = Class.forName("reflection.ConcreteClass");

		Class<?>[] classes = concreteClass.getClasses();
		/**
		 * class reflection.ConcreteClass$ConcreteClassPublicClass class
		 * reflection.ConcreteClass$ConcreteClassPublicEnum interface
		 * reflection.ConcreteClass$ConcreteClassPublicInterface class
		 * reflection.BaseClass$BaseClassInnerClass class
		 * reflection.BaseClass$BaseClassMemberEnum
		 */
		for (Class <?> c : classes) {
			System.out.println(c.toString());
		}
	}
}
