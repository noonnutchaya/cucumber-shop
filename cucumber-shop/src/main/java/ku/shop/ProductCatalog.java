package ku.shop;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    private Map<String, Product> products;
    private Map<String, Pets> petsMap;

    public ProductCatalog() {
        products = new HashMap<>();
        petsMap = new HashMap<>();
    }

    public void addProduct(String name, double price) {
        products.put(name, new Product(name, price));
    }

    public void addProductWithStock(String name,int num ,double price) {
        products.put(name, new Product(name, num,price));
    }

//    public void addPet(String name,int num, double price) {
//        petsMap.put(name, new Pets(name, num,price));
//    }

    public Product getProduct(String name) {
        return products.get(name);
    }
//    public Pets getPet(String name) {
//        return petsMap.get(name);
//    }
}
