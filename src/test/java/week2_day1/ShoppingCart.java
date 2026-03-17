package week2_day1;

import java.util.ArrayList;

class CartProduct {
	String name;
	double price;
	int quantity;

	CartProduct(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	double getTotal() {
		return price * quantity;
	}
}

public class ShoppingCart {

	public static void main(String[] args) {
		ArrayList<CartProduct> cart = new ArrayList<CartProduct>();
		// CartProduct p1 = new CartProduct("Blue", 99.99, 1)
		cart.add(new CartProduct("Blue", 99.99, 1));
		cart.add(new CartProduct("Red", 10, 1));
		cart.add(new CartProduct("White", 200, 2));

		double orderTotal = 0;
		for (CartProduct Product : cart) {
			System.out.println(
					Product.name + " | Rs." + Product.price + " x " + Product.quantity + " = Rs." + Product.getTotal());
			orderTotal += Product.getTotal();
		}
		System.out.println("Order total: " + orderTotal);
	}

}
