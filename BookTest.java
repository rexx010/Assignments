import java.util.Scanner;

public class BookTest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the number of copies you’d like to buy: ");
int copies = input.nextInt();

int total = Book. pricePerCopy(copies);

System.out.println("The price of the copies selected is :"+total);

}
}