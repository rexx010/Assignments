public class Kata{

public static int isEven(int a){
  boolean even = true;

    if(a % 2 == 0){
    even = true;
    System.out.println(even+", The number is an even number");
    }else{
    System.out.println(!even+", The number is an odd number");
    }
    return a;
}



public static int isPrimeNumber(int num){
 boolean prime = true;
 
 int count = 0;
  for(int counter = 1; counter <= num; counter++){
  if (num % counter == 0){
  count++;
  }
 }
  if(count == 2){
  System.out.println(prime+", The number is a prime number");
} else{
System.out.println(!prime+", The number is not a prime number");
}
return num;
}




public static int subtract(int one, int two){
  int result = (int) Math.abs (one - two);
  return result;
}



public static int divide(int num1, int num2){
if(num2 == 0){
return 0;
}else{
int result = num1 / num2;
return result;
}
}



public static int factor(int num){
int count = 0;
 for(int counter = 1; counter <= num; counter++){
    if(num % counter == 0){
    count++;
    }
  }
   return count;
}




public static int isSquare(int num){
boolean square = true;
int root = (int) Math.sqrt (num);
if(root * root == num){
System.out.println(square+", The number is a square number");
}else{
System.out.println(!square+", The number is not a square number");
}
return num;
}




public static int isPalindrome(int number){
boolean pal = true;
int copy = number;
int reversal = 0;
for(int counter = 1; counter <= copy; counter++){
int digit = copy % 10;
reversal = reversal * 10 + digit;
copy = copy / 10;
}
if(reversal == number){
System.out.println(pal+", The number is a palindrome");
}else{
System.out.println(!pal+", The number is not a palindrome");
}
return number;
}



public static int factorial(int one){
int result = 1;
 for(int counter = 1; counter <= one; counter++){
 result = result * counter;
}
return result;
}



public static int square(int one){
int output = one * one;
return output;
}

}