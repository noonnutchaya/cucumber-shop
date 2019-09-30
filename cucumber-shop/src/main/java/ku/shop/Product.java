package ku.shop;

public class Product {
    private double price;
    private String name;
    private int n;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String nameAni,int num ,double price ) {
        this.price = price;
        this.name = nameAni;
        this.n = num;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Price must be not be negative zero");
        this.price = price;
    }
}
