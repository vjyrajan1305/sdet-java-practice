package week1_day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:" );
		int num = sc.nextInt();
		int n1 = 0;
		System.out.print(n1 + " ");
		int n2 = 1;
		System.out.print(n2 + " ");
		for(int i=1;i<=num;i++) {
			int sum = n1+n2;
			System.out.print(sum + " ");
			n1 = n2;
		n2 = sum;
		}sc.close();
		}
}