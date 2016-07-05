package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {
	public static void main(String[] args) {
		// String s = "HelloWorld";
		String s = new String("HelloWorld");

		System.out.println("Hello World를 몇 번 출력할까요?");

		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();

		int i = 1;

		// Q: 아래 while 반복문을 사용하여 “Hello World”를 입력 받은 수 만큼 출력 하세요.

		while (count >= i) {
			System.out.println(s);
			i++;
		}

	}
}
