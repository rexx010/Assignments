import java.util.Scanner;

public class ArrayCollection{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the number of array you want: ");
int test = input.nextInt();

int [] array = new int[test];

System.out.print("Enter the element value: ");
for(int a = 0; a < test; a++){
System.out.print("Element "+(a + 1)+ ": ");
array [a] = input.nextInt();
}

System.out.print("The array elements are: ");
for(int a = 0; a < array.length; a++){
System.out.print(array[a]+ " ");
}

}
}