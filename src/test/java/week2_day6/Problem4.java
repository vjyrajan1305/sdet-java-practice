package week2_day6;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "programming";
		
		String word = "";
		
		for(int i=0;i<=(input.length()-1);i++) {
			
			char op = input.charAt(i);
			if(!word.contains(String.valueOf(op))) {
				word = word+op;
			}
		}
		System.out.println(word);
		
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for (char ch : input.toCharArray()) {
			set.add(ch);
		}
		
		StringBuilder result = new StringBuilder();
		for (Character ch : set) {
			result.append(ch);
		}
		System.out.println(result);

	}

}
