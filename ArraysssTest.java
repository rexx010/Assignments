import java.util.Scanner;
import java.util.Arrays;

public class ArraysssTest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the number of array you want: ");
int test = input.nextInt();

int [] array = new int [test];

System.out.println("Enter the value of the element: \n");
for(int a = 0; a < test; a++){
System.out.print("Element "+(a + 1)+ ": ");
array [a] = input.nextInt();
}

System.out.println();
System.out.println("The largest element is "+Arraysss.maximumIn(array));

System.out.println("The Smallest element is "+Arraysss.smallestIn(array));

System.out.println("The sum of the elements is "+Arraysss.sumOf(array));

System.out.println("The sum of even numbers in the elements is "+Arraysss.sumOfEvenNumbersIn(array));

System.out.println("The sum of odd numbers in the elements is "+Arraysss.sumOfOddNumbersIn(array));

System.out.println(Arraysss.maximumAndMinimumOf(array));

System.out.println("The number of the odd elements is "+Arraysss. noOfOddNumbersIn(array));

System.out.println("The number of the even elements is "+Arraysss. noOfEvenNumbersIn(array));

//System.out.println("The number of the even elements is "+Arraysss.oddNumbersIn(array));

System.out.println("The even elements are "+Arrays.toString(Arraysss.evenNumbersIn(array)));

System.out.println("The odd elements are "+Arrays.toString(Arraysss.oddNumbersIns(array)));

System.out.println("The number of the square elements is "+Arrays.toString(Arraysss.squareNumbersIn(array)));
}
}//Arrays.toString(