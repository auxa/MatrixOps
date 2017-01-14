
public class MatMulThread implements Runnable {
	int[][] A;
	int[][] Res;
	int row;
	int col;
	public MatMulThread(int[][] A, int[][] Res, int row, int col) {
		this.A=A;
		this.Res=Res;
		this.row=row;
		this.col=col;
	}
	
	@Override 
	public void run(){
		for(int k=0; k<Res.length;k++){
			Res[row][col] += A[row][k] * A[k][col];
		}
	}

}
