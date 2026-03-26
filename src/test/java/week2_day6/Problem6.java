package week2_day6;

public class Problem6 {

	public static void main(String[] args) {

		String str = "madam";
		char result = ' ';
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(str.indexOf(ch) == str.lastIndexOf(ch)){
				result = ch;
				break;
			}
		}
		System.out.println("First non repeated character: "+result);
		
	}

}
