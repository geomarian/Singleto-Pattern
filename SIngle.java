
public class SIngle {

	public Object obj;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IOperation iop = new Operation1();
		iop.setName();
	}

}

class Operation implements IOperation {

	public static void main(String[] args) {
		SIngle sin1 = new SIngle();

		sin1.obj = new Object();
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		// do y

	}

	@Override
	public void setNameX() {
		// TODO Auto-generated method stub

	}
}

class Operation1 implements IOperation {

	public static void main(String[] args) {
		SIngle sin1 = new SIngle();

		sin1.obj = new Object();
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		// do x

	}

	@Override
	public void setNameX() {
		// TODO Auto-generated method stub

	}
}

interface IOperation {
	public void setName();

	public void setNameX();
}