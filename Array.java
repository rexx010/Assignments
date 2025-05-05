public class Array{
public static void main(String[] args){

int [] number = new int [5];

number[0] = 22;
number[1] = 51;
number[2] = 38;
number[3] = 23;
number[4] = 48;

for(int counter = 0; counter < number.length; counter++){
System.out.print(number[counter]+" ");
}
System.out.println();
System.out.println();

for(int counter = 0; counter < number.length; counter++){
System.out.println(number[counter]+" ");
}

System.out.println();

int sum = 0;
for(int counter = 0; counter < number.length; counter++){
sum = sum + number[counter];
}
System.out.println("Total is = "+sum);


}
}