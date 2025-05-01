import java.util.Scanner;

public class AnnualRate{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a principal amount: ");
double principal = input.nextDouble ();

System.out.print("Enter a rate amount: ");
double rate = input.nextDouble();

System.out.print("Enter a duration amount: ");
double duration = input.nextDouble();

rate = rate /100/ 12;
duration = duration * 12;

double sum1 = principal * rate * Math.pow (1 + rate, duration);
double sum2 = Math.pow(1 + rate, duration) - 1;

double total = sum1 / sum2;

System.out.printf("%.2f%n", total);

}
}



