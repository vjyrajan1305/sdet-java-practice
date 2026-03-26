package week2_day6;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "automationexercise";
		char target ='e';
		int count =0;
		for(int i=0;i<(text.length()-1);i++) {
			char actual = text.charAt(i);
			if(actual== target) {
				count++;
			}
		}
		System.out.println(String.format("Number of %s present in %s is %d", target,text,count));
	}

}
