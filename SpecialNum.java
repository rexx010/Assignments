public class SpecialNum{
public static void main(String[] args){

int [] input = new input [4];
input[0] = 1;
input[1] = 2;
input[2] = 3;
input[3] = 2;

if(input[0] != input[1] || input[0] != input[2] && input[0] != input[3]){
System.out.print(input[0]);
}

if(input[1] != input[1] || input[1] != input[2] && input[1] != input[3]){
System.out.print(input[1]);
}

if(input[2] != input[0] || input[2] != input[1] && input[2] != input[3]){
System.out.print(input[2]);
}

if(input[3] != input[0] || input[3] != input[1] && input[3] != input[4]){
System.out.print(input[3]);
}





}
}