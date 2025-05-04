import java.util.Scanner;

public class KataFunctionUse{
public static void main(String[] args){

Scanner source = new Scanner(System.in);

System.out.print("Enter an integer number: ");
int one = source.nextInt();
Kata.isEven(one);


System.out.print("Enter an integer number: ");
int prime = source.nextInt();
Kata.isPrimeNumber(prime);


System.out.print("Enter two integer number: ");
int number1 = source.nextInt();
int number2 = source.nextInt();
int a = Kata.subtract(number1, number2);
System.out.printf("The sum is %d%n", a);


System.out.print("Enter an integer number: ");
int number = source.nextInt();
int a = Kata.factorial(number);
System.out.printf("The factorial is %d%n", a);


System.out.print("Enter an integer number: ");
int number = source.nextInt();
int a = Kata.factor(number);
System.out.printf("The number of the factor is %d%n", a);


System.out.print("Enter a square number: ");
int numberSquare = source.nextInt();
Kata.isSquare(numberSquare);


System.out.print("Enter a square number: ");
int Square = source.nextInt();
int answer = Kata.square(Square);
System.out.printf("The square of the number is %d%n", answer);


System.out.print("Enter a five digit number: ");
int five = source.nextInt();
Kata.isPalindrome(five);


System.out.print("Enter two int numbers: ");
int number1 = source.nextInt();
int number2 = source.nextInt();
int result = Kata.divide(number1, number2);
System.out.println(result);

}
}