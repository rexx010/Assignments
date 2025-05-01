public class PrimeWithin50{
public static void main(String[] args){

int numbers = 100;


for(int counter = 2; counter <= numbers; counter++){
int primeNumber = 0;

	for(int divider = 1; divider <= counter; divider++){

	if (counter % divider == 0) primeNumber++;
	}

 if (primeNumber == 2){
 System.out.printf("%d ", counter);
 }

}



}
}