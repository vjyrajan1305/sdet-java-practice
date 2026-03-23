package week2_day3;

import java.util.ArrayList;
import java.util.Collections;

public class TestSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> executionTimes = new ArrayList<>();
        executionTimes.add(450);   // TC01 — ms
        executionTimes.add(120);   // TC02
        executionTimes.add(890);   // TC03
        executionTimes.add(230);   // TC04
        executionTimes.add(670);   // TC05
        executionTimes.add(340);   // TC06
        System.out.println("Before sort: "+executionTimes);
        Collections.sort(executionTimes);
        System.out.println("\nAfter sort: "+executionTimes);
        
        Collections.reverse(executionTimes);
        System.out.println("\nReversed order: "+executionTimes);
        
        System.out.println("\nFastest test: " + Collections.min(executionTimes) + "ms");
        System.out.println("Slowest test: " + Collections.max(executionTimes) + "ms");
	}

}
