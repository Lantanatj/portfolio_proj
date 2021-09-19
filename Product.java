package chapter11;

class Product {

    private String productName;
    private int qty;
    private double price;
    private double totalPrice;


    public Product(String productName, int qty, double price, double totalPrice) {
        this.productName = productName;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;
    }



    // displayFormat
    public static void displayFormat() {
        System.out.print("\nName      Quantity    Price   Total Price\n");
    }

    // display
    public void display() {
        System.out.printf("%-9s %8d %10.2f %10.2f\n", productName, qty, price, totalPrice);
    }
}

