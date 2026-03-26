package week2_day6;

public class Problem5 {

	public static void main(String[] args) {
		String text = "Automation Exercise";
		int vowels = 0, consonants = 0;
		String vowelList = "aeiouAEIOU";
		System.out.println("Total char: "+text.length());
		for (Character ch : text.toCharArray()) {

			if (Character.isLetter(ch)) {
				if (vowelList.contains(String.valueOf(ch))) {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels: "+vowels);
		System.out.println("Consonants :"+consonants);
	}

}
