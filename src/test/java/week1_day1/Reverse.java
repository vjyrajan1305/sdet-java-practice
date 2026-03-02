package week1_day1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String next = sc.next();
		String reversed = "";
		for (int i = next.length() -1; i >= 0; i--) {
			reversed += next.charAt(i);
		}
		System.out.println(reversed);
		sc.close();
	}

}
