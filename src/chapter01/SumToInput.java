package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 : ");
		
		int cost = scanner.nextInt();
		
		int sum = 0;
		
		for(int i=1; i <= cost; i++ ){
			sum = sum + i;
		}
		
		System.out.println(sum);
		
	}
	
}
