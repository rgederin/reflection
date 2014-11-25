package reflection.classes;

public class GetDeclaredClasses {
	public static void main(String[] args) throws ClassNotFoundException {


		Class<?>[] explicitClasses = Class.forName("reflection.ConcreteClass")
				.getDeclaredClasses();
		/**
		 * class reflection.ConcreteClass$ConcreteClassDefaultClass class
		 * reflection.ConcreteClass$ConcreteClassDefaultEnum class
		 * reflection.ConcreteClass$ConcreteClassPrivateClass class
		 * reflection.ConcreteClass$ConcreteClassProtectedClass class
		 * reflection.ConcreteClass$ConcreteClassPublicClass class
		 * reflection.ConcreteClass$ConcreteClassPublicEnum interface
		 * reflection.ConcreteClass$ConcreteClassPublicInterface
		 */
		for (Class<?> c : explicitClasses) {
			System.out.println(c.toString());
		}
	}
}
