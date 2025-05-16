import java.util.Scanner;

public class AdditionOfDigits{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int number = 0;

while(true){
System.out.print("Enter integers between 1 and 10000: ");
number = input.nextInt();
if(number > 1 && number < 10000)break;
}

int result = AdditionOfDigitsFunction.sumOfNumbers(number);

System.out.print(result);
}
}