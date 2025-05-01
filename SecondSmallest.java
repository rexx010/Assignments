import java.util.Scanner;

public class SecondSmallest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int grade1 = 200000000;
String name1 = null;
int grade2 = 200000000;
String name2 = null;

System.out.print("Enter the number of students: ");
int count = input.nextInt();

for(int counter = 1; counter <= count; counter++){

System.out.println("Enter Student name: ");
String name = input.next();

System.out.println("Enter Student grade: ");
int grade = input.nextInt();

int smallest = grade;

if (smallest < grade1){

grade2 = grade1;
name2 = name1;

grade1 = smallest;
name1 = name;



}else{
if(smallest < grade2){
grade2 = grade;
name2 = name;
}
}

}
System.out.printf("The Smallest is %s %d%n", name1, grade1);
System.out.printf("The Second Smallest is %s %d%n", name2, grade2);


}
}