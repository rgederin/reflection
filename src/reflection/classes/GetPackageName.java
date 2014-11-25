package reflection.classes;

public class GetPackageName {

	public static void main(String[] args) throws ClassNotFoundException {
		//prints "reflection"
		System.out.println(Class.forName("reflection.BaseInterface").getPackage().getName());
	}

}
