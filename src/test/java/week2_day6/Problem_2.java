package week2_day6;

public class Problem_2 {

	public static void main(String[] args) {

		String word ="madam";
		
		String rev = new StringBuilder(word).reverse().toString();
		
		if(word.equals(rev)) {
			System.out.println(String.format("%s is a Palindrome", word));
		}else {
			System.out.println(String.format("%s is not a Palindrome", word));
		}
	}

}
