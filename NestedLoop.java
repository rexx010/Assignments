public class NestedLoop{
public static void main(String[] args){


for(int counter = 1; counter <= 8; counter++){


	for(int space = 7; space >= counter; space--){
		System.out.print("  ");
}

		for(int numbers = 1; numbers <= counter; numbers++){
	
		//int power = (int) Math.pow (numbers, 2);
System.out.print(numbers+" ");

}

for(int numbers = counter - 1; numbers >= 1; numbers--){
System.out.print(numbers +" ");

}
System.out.println();
}




}
}



		
