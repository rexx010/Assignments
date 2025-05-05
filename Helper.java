public class Helper {

public static int add(int a, int b) {
	return a + b;
}

public static void printStars(int numberOfStars) {	
	for (int i = 1; i <= numberOfStars; i++) {
		for (int j = 1; j <= numberOfStars; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
}
}