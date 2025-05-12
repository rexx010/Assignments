public class Multiples{

public static void multiplesOf(int a, int b){
int total = 0;

	System.out.println("\t\tMultiplication Table");
	System.out.println();

	for(int counter = a; counter <= b; counter++){
		System.out.print(counter+"|\t");

		for(int count = a; count <= b; count++){
			total = count * counter;
			System.out.print(total+"\t");
		}
	System.out.println();
	}

}


}