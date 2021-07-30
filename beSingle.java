
public class beSingle {

	private static beSingle driver;
	private beSingle() {
		
	}
	public static beSingle getInstance() {
		if(driver==null) {
			synchronized(beSingle.class) {
				if(driver==null) {
					driver = new beSingle();
				}
			}
		}
		return driver;
	}
	
	
	
}