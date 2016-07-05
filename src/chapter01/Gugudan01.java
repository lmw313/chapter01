package chapter01;

public class Gugudan01 {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		int k = 1;

		while (i <= 9) {
			while (j <= 9) {
				k = i * j;
				System.out.println(i + "*" + j + "=" + k);
				j++;
			}
			j = 1;
			i++;
			System.out.println("==============================");

		}

	}
}
