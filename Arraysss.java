public class Arraysss{

public static int maximumIn(int [] array){
int max = array[0];
for(int i = 1; i < array.length; i++){
if(array[i] > max) max = array[i];
}
return max;
}


public static int smallestIn(int [] array){
int min = array[0];
for(int i = 1; i < array.length; i++){
if(array[i] < min) min = array[i];
}
return min;

}


public static int sumOf(int [] array){
int total = 0;
for(int i = 0; i < array.length; i++){
total += array[i];
}
return total;

}


public static int sumOfEvenNumbersIn(int [] array){
int evenNum = 0;
for(int i = 0; i < array.length; i++){
if(array[i] % 2 == 0)evenNum += array[i];
}
return evenNum;

}


public static int sumOfOddNumbersIn(int [] array){
int oddNum = 0;
for(int i = 0; i < array.length; i++){
if(array[i] % 2 != 0)oddNum += array[i];
}
return oddNum;

}


public static String maximumAndMinimumOf(int [] array){
int max = array[0];
int min = array[0];
for(int i = 0; i < array.length; i++){
if(array[i] > max) max = array[i];
if(array[i] < min) min = array[i];
}
String total = "The minimun is "+min+" and the maximum is "+max;
return total;
}


public static int noOfOddNumbersIn(int [] array){
int oddNum = 0;
int count = 0;
for(int i = 0; i < array.length; i++){
if(array[i] % 2 != 0)count++;
}
return count;

}


public static int noOfEvenNumbersIn(int [] array){
int evenNum = 0;
int count = 0;
for(int i = 0; i < array.length; i++){
if(array[i] % 2 == 0)count++;
}
return count;

}

/*
public static int oddNumbersIn(int [] array){
int oddNum = 0;
for(int i = 0; i < array.length; i++){
if(array[i] % 2 != 0)oddNum += array[i];
}
return oddNum;

}
*/


public static int[] squareNumbersIn(int [] array){
	int total=0;
	int [] square = new int[array.length];
	for(int i = 0; i < array.length; i++){
		square[i] = array[i] * array[i];
	}
	return square;
}



public static int[] evenNumbersIn(int [] array){

int count = 0;
for(int i = 0; i < array.length; i++){
if(array[i] % 2 == 0) count++;
}

int[] even = new int [count];
int j = 0;
for(int i = 0; i< array.length; i++){
if(array[i] % 2 == 0){
even[j] = array[i];
j++;
}

}
return even;
}



public static int[] oddNumbersIns(int [] array){

int count = 0;
for(int i = 0; i < array.length; i++){
if(array[i] % 2 != 0) count++;
}

int[] odd = new int [count];
int j = 0;
for(int i = 0; i< array.length; i++){
if(array[i] % 2 != 0){
odd[j] = array[i];
j++;
}

}
return odd;
}







}