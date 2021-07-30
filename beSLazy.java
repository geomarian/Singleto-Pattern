
public class beSLazy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thr1 = new Thread(new Runnable() {
			public void run() {
				beSLazy1 raOne = beSLazy1.getValue();
			}

		});

		Thread thr2 = new Thread(new Runnable() {
			public void run() {
				beSLazy1 raOne1 = beSLazy1.getValue(); // If condition is used
			}
		});

		thr1.start();
		Thread.sleep(1000);
		thr2.start();

	}

}
