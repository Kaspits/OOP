package lesson_one.vending_machine;

import java.util.ArrayList;
import java.util.List;

import lesson_one.product.Product;

public class VendingMachine {
    private int productId;
    private List<Product> productList;

    public VendingMachine(int id) {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        product.setId(productId++);
        productList.add(product);
    }

    public String getProductsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:\n");
        for (Product product : productList) {
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
