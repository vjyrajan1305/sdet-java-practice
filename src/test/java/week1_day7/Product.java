package week1_day7;

class Product {
    private String productId;
    private String name;
    private String category;
    private double price;
    private int quantity;

    Product(String productId, String name, String category, double price) {
        this.productId = productId;
        setName(name);
        setPrice(price);
        this.category = category;
        this.quantity = 1;
    }

    // Getters
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public double getTotalPrice() { return price * quantity; }

    // Setters with validation
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Product name cannot be empty");
        } else {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Price must be greater than 0");
        } else {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.out.println("Quantity must be greater than 0");
        } else {
            this.quantity = quantity;
        }
    }

    public void displayProduct() {
        System.out.println("  Product: " + name +
                " | Category: " + category +
                " | Price: Rs." + price +
                " | Qty: " + quantity +
                " | Total: Rs." + getTotalPrice());
    }
}