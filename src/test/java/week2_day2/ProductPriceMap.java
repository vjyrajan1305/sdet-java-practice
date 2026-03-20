package week2_day2;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ProductPriceMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Double> productPrices = new LinkedHashMap<>();
		productPrices.put("Blue Top", 500.0);
		productPrices.put("Men Tshirt", 400.0);
		productPrices.put("Stylish Dress", 1500.0);
		productPrices.put("Winter Top", 600.0);
		productPrices.put("Slim Fit Jeans", 1200.0);
		// all products
		for (Entry<String, Double> allProducts : productPrices.entrySet()) {
			System.out.println("Product: " + allProducts.getKey() + " , Price: " + allProducts.getValue());

		}
		// most expensive
		String mostexp = "";
		double maxPrice = 0;
		for (Entry<String, Double> allProducts : productPrices.entrySet()) {
			if (allProducts.getValue() > maxPrice) {
				maxPrice = allProducts.getValue();
				mostexp = allProducts.getKey();
			}

		}
		System.out.println("Most expensive product is: " + mostexp + " With a Price of " + maxPrice);

		// find cheapest
		String minexp = "";
		double minPrice = Double.MAX_VALUE;
		for (Entry<String, Double> allProducts : productPrices.entrySet()) {
			if (allProducts.getValue() < minPrice) {
				minPrice = allProducts.getValue();
				minexp = allProducts.getKey();

			}
		}
		System.out.println("Least expensive product is: " + minexp + " With a Price of " + minPrice);
		double total =0;
		for (Double values:productPrices.values()) {
			total+=values;
		}
		System.out.println("Total of Products is "+total);
	}
}
