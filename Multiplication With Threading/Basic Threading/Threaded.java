
public class Threaded {
	static int[][] matrix = new int[3][3];
	static int[][] result = new int[3][3];
	
	public static void main(String [] args){
		
		int[] array = {1,2,3,4};
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix.length;j++){
				matrix[i][j]= array[i];
			}
		}
		
		try{
			Multiply multiply = new Multiply(3,3);
			
			MatrixMul thread1 = new MatrixMul(multiply);
			MatrixMul thread2 = new MatrixMul(multiply);
			MatrixMul thread3 = new MatrixMul(multiply);
			
			Thread th1 = new Thread(thread1);
			Thread th2 = new Thread(thread2);
			Thread th3 = new Thread(thread3);
			
			th1.start();
			th2.start();
			th3.start();
			
			th1.join();
			th2.join();
			th3.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Result");
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix.length;j++){
				System.out.print(result[i][j] +" ");
			}
			System.out.print("\n");
		}
		
		
	}
}
