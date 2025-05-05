public class MyFunctions{

public static int isEven(int a){
  boolean even = true;

    if(a % 2 == 0){
    isEven = true;
    System.out.print(even);
    }else{
    System.out.print(!even);
    }
}

public static int isPrimeNumber(int num){
 boolean is prime = true;
 
 int count = 0
  for(int counter = 1; counter <= num; counter++){
  if (num % 2 == 0){
  count++ 
  }
 }
  if(count == 2){
  System.out.print(prime+"num is a prime number");
} else{
System.out.print(!prime+"num is not a prime number");
}


}
}