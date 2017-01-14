
public class MatrixMul implements Runnable{
	private final Multiply mul;
	
	public MatrixMul(Multiply mul){
		this.mul=mul;
	}
	
	
	@Override
	public void run(){
		mul.multiplyMatrix();
	}
}
