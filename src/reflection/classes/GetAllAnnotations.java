package reflection.classes;

import java.util.Arrays;

/**
 * getAnnotations() method returns all the annotations for the element, we can
 * use it with class, fields and methods also. Note that only annotations
 * available with reflection are with retention policy of RUNTIME, check out
 * Java Annotations Tutorial. We will look into this in more details in later
 * sections.
 * 
 * @author rgederin
 * 
 */
public class GetAllAnnotations {
	public static void main(String[] args) throws ClassNotFoundException {
		java.lang.annotation.Annotation[] annotations = Class.forName(
				"reflection.ConcreteClass").getAnnotations();
		// prints [@java.lang.Deprecated()]
		System.out.println(Arrays.toString(annotations));
	}
}
