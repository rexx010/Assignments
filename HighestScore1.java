import java.util.Scanner;

public class HighestScore1{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

String name1 = null;
String names = null;
int score1 = 0;
int highest = 0;


System.out.print("Enter the number of students: ");
int num = input.nextInt();


for(int counter = 1;counter <= num; counter++){

System.out.print("Enter your name: ");
name1 = input.next();

System.out.print("Enter you student score: ");
score1 = input.nextInt();


if(score1 > highest){
highest = score1;
names = name1;
}

}
System.out.println("The name of the highest student and his/her score is");
System.out.println();
System.out.println("Name	Score");
System.out.printf("%s\t%d%n", names, highest);
}
}
