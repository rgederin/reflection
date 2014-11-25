package reflection.classes;

import java.lang.reflect.TypeVariable;

/**
 * getTypeParameters() returns the array of TypeVariable if there are any Type
 * parameters associated with the class. The type parameters are returned in the
 * same order as declared.
 * 
 * @author rgederin
 * 
 */
public class GetTypeParameters {
	public static void main(String[] args) throws ClassNotFoundException {
		// Get Type parameters (generics)
		TypeVariable<?>[] typeParameters = Class.forName("java.util.HashMap")
				.getTypeParameters();
		for (TypeVariable<?> t : typeParameters)
			System.out.print(t.getName() + ",");
	}
}
