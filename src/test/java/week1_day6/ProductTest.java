package week1_day6;

class Product {
	private String productId;
	private String name;
	private double price;
	private int stock;

	public Product(String productId, String name, double price, int stock) {
		this.productId = productId;
		setName(name);
		setPrice(price);
		setStock(stock);
	}

	public String getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public boolean isInStock() {
		return stock > 0;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			System.out.println("Product name cannot be empty");
		} else {
			this.name = name;
		}
	}

	public void setPrice(double price) {
		if (price < 0) {
			System.out.println("Price cannot be negative");
		} else {
			this.price = price;
		}
	}

	public void setStock(int stock) {
		if (stock < 0) {
			System.out.println("Stock cannot be negative");
		} else {
			this.stock = stock;
		}
	}

	public void addStock(int quantity) {
		if (quantity <= 0) {
			System.out.println("Quantity must be positive");
		} else {
			stock += quantity;
			System.out.println("Stock added. New stock: " + stock);
		}
	}

	public void sellProduct(int quantity) {
		if (quantity > stock) {
			System.out.println("Not enough stock. Available: " + stock);
		} else {
			stock -= quantity;
			System.out.println("Sold " + quantity + " units. Remaining: " + stock);
		}
	}

	public void displayProduct() {
		System.out.println("ID: " + productId + " | Name: " + name + " | Price: " + price + " | Stock: " + stock
				+ " | InStock: " + isInStock());
	}
}

public class ProductTest {
	public static void main(String[] args) {
		Product p = new Product("P001", "Selenium Book", 599.0, 50);
		p.displayProduct();

		p.sellProduct(10);
		p.addStock(20);
		p.setPrice(-100); // invalid
		p.sellProduct(100); // not enough stock

		p.displayProduct();
	}
}