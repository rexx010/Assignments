public class AdditionOfDigitsFunction{

	public static int sumOfNumbers(int number){

		int number_copy = number;
 		int number_deducter = 0;
 		int sum_of_number = 0;

		while(number_copy != 0){
  		 number_deducter = number_copy % 10;
  		 sum_of_number += number_deducter;
 		 number_copy = number_copy / 10;
		}
return sum_of_number;
}



}