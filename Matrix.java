
public class Matrix {
	private static int[][] matrix= new int[3][3];
	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix.length;j++){
				matrix[i][j]= array[i];
			}
		}
		int[][] var= simpleMultiply();
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix.length;j++){
				System.out.print(var[i][j] +" ");
			}
			System.out.print("\n");
		}
		

	}
	public static int[][] simpleMultiply(){
		int[][] newArray = new int [3][3];
		for(int i=0; i< matrix.length;i++){
			for(int j=0; j<matrix[0].length;j++){
				for(int r =0; r< matrix.length;r++){
					newArray[i][j] +=( matrix[i][r] * matrix [r][j]);
				}
			}
		}
		return newArray;
	}

}
