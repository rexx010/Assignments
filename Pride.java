public class PowerNew{
public static void main(String[] args){

int number = 1;
int counter;

System.out.println("N1	N2	N3	N4");

for(number = 1; number <= 5; number++){

int num2 = (int) Math.pow (number, 2);

int num3 = (int) Math.pow (number, 3);

int num4 = (int) Math.pow (number, 4);

System.out.printf("%d\t%d\t%d\t%d\t%n", number, num2, num3, num4);

}
}
}