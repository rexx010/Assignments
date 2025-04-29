import java.util.Scanner;

public class FuelPrice{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
double price = 855.00;

System.out.print("Enter your price amount: ");
double userPrice = input.nextInt();

double budget = userPrice / price;

System.out.printf("The number of fuel per liter the user can buy is %.2f%n", budget);
}
}