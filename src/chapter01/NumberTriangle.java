package chapter01;

public class NumberTriangle {

	public static void main(String[] args) {
		for (int i = 1; i < 9; i++) {
			if (i < 4 && 0 < i) {
				for (int j = 1; j <= i; j++) {
					System.out.print(i);
				}
			} else if (i < 8 && 3 < i) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else if (i < 9 && 7 < i) {
				for (int j = 1; j <= i; j++) {
					System.out.print("n");
				}
			}
			System.out.println();
		}
	}
}
