public class CharArray{
public static void main(String[] args){

char [][] score =new  char [3][3];

score[0][0] = 'x';
score[0][1] = 'o';
score[0][2] = 'x';

score[1][0] = 'o';
score[1][1] = 'o';
score[1][2] = 'o';

score[2][0] = 'x';
score[2][1] = 'x';
score[2][2] = 'o';

for(int j = 0; j < score.length; j++){
System.out.println(score[j]);
}

}
}