public class ArrayColumnMAx{
	public static void main(String[] args){

	int[][] value = {
			{6,4,2,7,9},
			{21, 1},
			{22,3,10,13,12}
			};

	int max = value[0][0];

	for(int count = 1; count < value.length; count++){
	for(int j = 0; j < value[count].length; j++){
		if(max < value[count][j])max = value[count][j];
	}
	}
System.out.print(max);
	}
}