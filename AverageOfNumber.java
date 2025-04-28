import java.util.Scanner;

public class AverageOfNumber{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int positive = 0;
int negative = 0;
int total = 0;
double average = 0;
int user = 1;
int counter = 1;
int num = 0;

while(user != 0){

System.out.print("Enter a positive or a negative number and press 0 to stop: ");
user = input.nextInt();

if(user == 0){
counter -=1;
}

if(user < 0){
total += user;
negative++;
num++;
}

if(user > 0){
total += user;
positive++;
num++;
}

counter++;

}
average = (double) total / num;

System.out.printf("the number of positive is %d%n", positive);
System.out.printf("the number of negative is %d%n", negative);
System.out.printf("The total is %d%n", total);
//System.out.printf("The count is %d%n", counter);
System.out.printf("The average is %.2f%n", average);

}
}