import java.util.Scanner;
public class Determinant 
{
	public static double determinant(double A[][],int size)
	{
		double result=0;
		if(size == 1){	//1x1 Matrix
			result = A[0][0];
		}
		else if (size == 2){	//2X2 Matrix
			result = A[0][0]*A[1][1] - A[1][0]*A[0][1];
		}
		else{	//NxN Matrix
			result=0;
			for(int elems=0;elems<size;elems++){
				double[][] subMatrix = new double[size-1][];
				for(int k=0;k<(size-1);k++){
					subMatrix[k] = new double[size-1];
				}
				for(int i=1;i<size;i++){
					int calc=0;
					for(int j=0;j<size;j++){
						if(j != elems){
							subMatrix[i-1][calc] = A[i][j];
							calc++;
						}
					}
				}
				result += Math.pow(-1.0,1.0+elems+1.0)* A[0][elems] * determinant(subMatrix,size-1);	//weird thing with all the pluses and minuses
			}
		}
		return result;
	}


	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the order of the square matrix");
		int n = input.nextInt();

		System.out.println("Enter the elements of the square matrix");
		double[][] mat = new double[n][n];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				mat[i][j] = input.nextDouble();
			}
		}


		System.out.println("The determinant of the Matrix is : "+ determinant(mat, n));

		input.close();

	}
}