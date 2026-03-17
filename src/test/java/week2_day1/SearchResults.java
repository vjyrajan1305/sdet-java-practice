package week2_day1;

import java.util.ArrayList;

public class SearchResults {
    public static void main(String[] args) {
    	ArrayList<String> allProducts = new ArrayList<String>();
    	allProducts.add("Blue Top");
    	allProducts.add("Red Top");
    	allProducts.add("green salwar");
    	allProducts.add("Top White");
    	allProducts.add("Violet");
    	
    	String keyword = "Top";
    	ArrayList<String> searchResult = new ArrayList<String>();
    	for (String result : allProducts) {
			if(result.contains(keyword)) {
				searchResult.add(result);
			}
		}
    	System.out.println("Total Products: "+allProducts.size());
    	System.out.println("Total of Searched Products: "+searchResult.size());
    	for (String product : searchResult) {
			System.out.println("Product with "+keyword+" keyword: "+product);
		}
}
}