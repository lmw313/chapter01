package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자 : ");
		int divisior = 2;
		int num = stdin.nextInt();
		boolean isPrime = true;

		while (divisior < num) {
			 if (num % divisior == 0) {
				isPrime = false;
			}
			 divisior++;
		}

		if (isPrime == true) {
			System.out.println(num + "은(는) 소수입니다.");
		} else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}

	}

}
