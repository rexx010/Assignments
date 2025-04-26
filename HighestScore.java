import java.util.Scanner;

public class HighestScore{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Name	Score");

String name = null;
int score = 0;
int highest = 0;

for(int number = 1; number <= 5; number++){

System.out.println("Enter your name: ");
name = input.nextLine();

System.out.println("Enter you student score: ");
score = input.nextInt();

highest = score;

if(score > highest){
highest = score;
}

System.out.printf("%s\t%d%n", name, highest);

number++;
}




}
}