import java.util.Scanner;

public class AnIdea{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


int counter = 1;
int total = 0;
int addup = 0;
int multiply = 0;

String message = """

Welcome to Rexx-Calculator
press a number to select what you want to achieve

 1 to Add
 2 to Subtract
 3 to Multiply
 4 to divide
""";
System.out.println(message);
int decision = input.nextInt();

switch(decision){
case 1: System.out.println("You choose Add");
message = """
Enter as much number you'd like to add int integers and press 0 to stop
""";
System.out.println(message);

decision = 1;
while(decision != 0){
decision = input.nextInt();
addup += decision;
counter++;
}
System.out.printf("The sum of the number entered is %d%n", addup);

message = """
to start again press 0
""";
System.out.println(message);
decision = input.nextInt();
switch(decision){
case 0: main(args);
}

break;

case 2: System.out.println("You choose Subtract");
message = """
Enter as much number you'd like to subtract in integers and press 0 to stop
""";
System.out.println(message);

decision = 1;
int num = input.nextInt();
addup += num;
while(decision != 0){
decision = input.nextInt();
addup -= decision;
//total = addup;
counter++;
}
System.out.printf("The sum of the number entered is %d%n", addup);

message = """
to start again press 0
""";
System.out.println(message);
decision = input.nextInt();
switch(decision){
case 0: main(args);
}
break;

case 3: System.out.println("You choose multiplication");
message = """
Enter two numbers you'd like to multiply in integers and press 0 to stop
""";
System.out.println(message);

decision = 1;
num = input.nextInt();
addup += num;
while(decision <= 5){
decision = input.nextInt();
addup *= decision;
//total = counter * decision;
//multiply += total;
counter++;
}
System.out.printf("The sum of the number entered is %d%n", addup);

message = """
to start again press 0
""";
System.out.println(message);
decision = input.nextInt();
switch(decision){
case 0: main(args);
}
break;

case 4: System.out.println("You choose division");
message = """
Enter as much numbers you'd like to divide in integers and press 0 to stop
""";
System.out.println(message);

decision = 1;
num = input.nextInt();
addup += num;
while(decision <= 2){
decision = input.nextInt();
addup /= decision;
//total = addup / decision;
counter++;
}
System.out.printf("The sum of the number entered is %d%n", addup);

message = """
to start again press 0
""";
System.out.println(message);
decision = input.nextInt();
switch(decision){
case 0: main(args);
}
break;


}

}
}