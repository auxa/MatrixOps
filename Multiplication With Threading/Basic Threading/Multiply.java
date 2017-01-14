
public class Multiply extends Threaded {
	private int i;
	private int j;
	private int prob;
	Multiply(int i, int j){
		this.i=i;
		this.j=j;
		this.prob=0;
	}
	public synchronized void multiplyMatrix(){
		int curSum =0;
		for(int a =0; a<i; a++){
			curSum=0;
			for(int b=0; b<j; b++){
				curSum += matrix[prob][b] *matrix[b][a];
			}
			result[prob][a]=curSum;
		}
		if(prob>=i){
			return;
		}else{
			prob++;
		}
	}
}
