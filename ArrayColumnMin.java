public class ArrayColumnMin{
	public static void main(String[] args){

	int[] value = {6,4,2,7,9};

	int min = value[0];

	for(int count = 1; count < value.length; count++){
		if(min  > value[count])min = value[count];
	}

System.out.print(min);
	}
}