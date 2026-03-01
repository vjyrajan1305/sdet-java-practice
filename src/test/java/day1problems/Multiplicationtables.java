package day1problems;

import java.util.Scanner;

public class Multiplicationtables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int i;
		int num = sc.nextInt();
		for (i = 1; i <= 10; i++) 
		{
			System.out.println(num + "*" + i + "=" + (num * i));
		}
		sc.close();
	}

}
