public class Book{

public static int pricePerCopy(int quantity){

int price = 0;
if(quantity >= 1 && quantity <= 4) price = quantity * 2000;

if(quantity >= 5 && quantity <= 9) price = quantity * 1800;

if(quantity >= 10 && quantity <= 29) price = quantity * 1600;

if(quantity >= 30 && quantity <= 49) price = quantity * 1500;

if(quantity >= 50 && quantity <= 99) price = quantity * 1300;

if(quantity >= 100 && quantity <= 199) price = quantity * 1200;

if(quantity >= 200 && quantity <= 499) price = quantity * 1100;

if(quantity >= 500) price = quantity * 1000;

return price;
}




}