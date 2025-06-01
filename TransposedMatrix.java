import java.util.Arrays;

public class TransposedMatrix{
public static void main(String[] args){

int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};

int row = numbers.length;
int column = numbers[0].length;

int[][] trans = new int [row][column];

for(int i = 0; i < row; i++){
	for(int j = 0; j < column; j++){
		trans[i][j] = numbers[j][i];
		}
	}
System.out.print(Arrays.deepToString(trans));
}
}