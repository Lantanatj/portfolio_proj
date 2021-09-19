package chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        // variables
        String productName = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
        double sumTotalPrice = 0.0;
        double vat = 0.0;
        double overAllTotal = 0.0;
        char choice = '\0' ;

        Scanner scan = new Scanner(System.in);

        List<Product> product = new ArrayList<>();

        do {
            System.out.println("Enter product details,");
            System.out.print("Name of product: ");
            productName = scan.nextLine();
            System.out.print("Quantity: ");
            quantity = scan.nextInt();
            System.out.print("Price (per item): ");
            price = scan.nextDouble();

            totalPrice = price * quantity;

            sumTotalPrice += totalPrice;

            //calculate VAT
            vat = (5 * sumTotalPrice) / 100;


            overAllTotal = vat + sumTotalPrice;



            // create Product class object and add it to the list
            product.add(new Product(productName, quantity, price, totalPrice));


            System.out.print("Do you want to add more item? (y= yes or n= no): ");
            choice = scan.next().charAt(0);

            // read remaining characters, don't store (no use)
            scan.nextLine();
        } while (choice == 'y' || choice == 'Y');

        // display all product with its properties
        Product.displayFormat();
        for (Product p : product) {
            p.display();
        }


        System.out.println("\nTotal Price = " + sumTotalPrice);
        System.out.println("\nvat = " + vat);
        System.out.println("\namountToPay = " + overAllTotal);

        scan.close();
    }

}
