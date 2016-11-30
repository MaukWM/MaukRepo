package ss.week3;

public class Multiplication implements OperatorWithIdentity {

	public int operate(int left, int right) {
		return right*left;
	}
	
	public int identity() {
		return 1;
	}
}
