import java.util.Scanner;

public class HighestScore2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

String name1 = null;
String names = null;
String name2 = null;
int score1 = 0;
int highest = 0;
int highest2 = 0;


System.out.print("Enter the number of students: ");
int num = input.nextInt();


for(int counter = 1;counter <= num; counter++){

System.out.print("Enter your name: ");
name1 = input.next();

System.out.print("Enter you student score: ");
score1 = input.nextInt();


if(score1 > highest){

highest2 = highest;
name2 = names;

highest = score1;
names = name1;
} 
else {
if(score1 > highest2){

highest2 = score1;
name2 = name1;
}
}

}
System.out.println("The name of the student and highest score is");
System.out.println();
System.out.println("Name	Score");
System.out.printf("%s\t%d%n", names, highest);

System.out.println("The name of the second highest student and his/her score is");
System.out.println();
System.out.println("Name	Score");
System.out.printf("%s\t%d%n", name2, highest2);
}
}
