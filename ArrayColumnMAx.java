public class ArrayColumnMAx{
	public static void main(String[] args){

	int[] value = {6,4,2,7,9};

	int max = value[0];

	for(int count = 1; count < value.length; count++){
		if(max < value[count])max = value[count];
	}

System.out.print(max);
	}
}