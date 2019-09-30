package ku.shop;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    private Map<String, Product> products;
    private Map<Product, Integer> productsWithStock;


    public ProductCatalog() {
        products = new HashMap<>();
    }

    public void addProduct(String name, double price) {
        products.put(name, new Product(name, price));
    }

    public void addProductWithStock(String name, double price, int n) {
        productsWithStock.put(new Product(name, price), n );
    }

    public Product getProduct(String name) {
        return products.get(name);
    }

    public void productsWithStock(String name, double price, int num) {
        productsWithStock.put(new Product(name, price), num);
    }
}
