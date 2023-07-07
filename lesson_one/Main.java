package lesson_one;

import lesson_one.product.Bottle;
import lesson_one.product.Product;
import lesson_one.vending_machine.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(123);

        Product product1 = new Bottle("coca-cola", 150, 1.5);
        Product product2 = new Product("Milco", 100);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);

        System.out.println(vendingMachine.getProductsInfo());
    }
}
