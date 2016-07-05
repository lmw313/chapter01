package chapter01;

public class Gugudan02 {

	public static void main(String[] args) {
		int k = 0;

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				k = i * j;
				System.out.print(j + "*" + i + "=" + k + "\t");
				
			}
			System.out.println();
		}

	}

}
