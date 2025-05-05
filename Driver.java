import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		Helper.printStars(number);

		System.out.print("Enter two numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		int a = Helper.add(number1, number2);
		System.out.printf("The sum is %d",a);
	}
}