public class ArrayColumnMAx{
	public static void main(String[] args){

	int[][] value = {
			{6,4,2,7,9},
			{21, 1},
			{22,3,10,13,12}
			};

	int min = value[0][0];

	for(int count = 1; count < value.length; count++){
	for(int j = 0; j < value[count].length; j++){
		if(min > value[count][j])min = value[count][j];
	}
	}
System.out.print(min);  
	}
}