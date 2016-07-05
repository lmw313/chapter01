package chapter01;

public class Swap {

	public static void main(String[] args) {

		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		int n1 = 10;
		int n2 = 30;
		int swap = 0;

		if (n1 > n2) {
			System.out.println("n1: " + n1);
			System.out.println("n2: " + n2);
		}

		else if (n2 > n1) {
			swap = n1;
			n1 = n2;
			n2 = swap;
			System.out.println("n1: " + n1);
			System.out.println("n2: " + n2);
		}

		else {
			System.out.println("n1과 n2의 값은 " + n1 + "로 동일합니다.");
		}

		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;

		if (a1 >= a2) {
			if (a1 >= a3) {
				System.out.println("최대 값은 " + a1 + "입니다.");
			} else {
				System.out.println("최대 값은 " + a3 + "입니다.");
			}
		}

		else if (a2 >= a1) {
			if (a2 >= a3) {
				System.out.println("최대 값은 " + a2 + "입니다.");
			} else {
				System.out.println("최대 값은 " + a3 + "입니다.");
			}
		}

		else if (a3 >= a1) {
			if (a3 >= a2) {
				System.out.println("최대 값은 " + a3 + "입니다.");
			} else {
				System.out.println("최대 값은 " + a2 + "입니다.");
			}
		}

	}

}
