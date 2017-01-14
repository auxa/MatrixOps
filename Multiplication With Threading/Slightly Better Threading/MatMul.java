
public class MatMul {
	private static int[][] matrix= new int[3][3];
	private static int[][] result= new int[3][3];

	public static Thread[][] threads = new Thread[3][3];
	public static void main(String[] args) throws InterruptedException {
		int[] array = {1,2,3,4};
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix.length;j++){
				matrix[i][j]= array[i];
			}
		}
		try{
		for(int i=0; i<matrix.length;i++){
			for (int j = 0; j < matrix.length; j++) {
				threads[i][j] = new Thread(new MatMulThread(matrix, result, i, j));
				threads[i][j].start();
				
				threads[i][j].join();
				
			}
		}
		}catch(InterruptedException ie){}
		
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix.length;j++){
				System.out.print(result[i][j] +" ");
			}
			System.out.print("\n");
		}
		

	}

}
