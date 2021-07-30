
public class beSLazy1 {
	
	
	private static beSLazy1 raOne;  //Lazy

	private beSLazy1() {
	//	System.out.println("Singleton created");

	}

	public static beSLazy1 getValue() {
		if (raOne == null) { // if condition is removed it will print twice. becoz of 2 obj

			synchronized (beSLazy1.class) {
				if (raOne == null) {

					raOne = new beSLazy1();
				}
			}
		}
		return raOne;

	}
}
